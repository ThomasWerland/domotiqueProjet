CREATE TABLE IF NOT EXISTS `domotique`.`User` (
  `username` VARCHAR(100) NOT NULL,
  `password` VARCHAR(100) NOT NULL,
  `authorities` VARCHAR(100) NOT NULL,
  `non_expired` TINYINT NOT NULL DEFAULT 1,
  `non_locked` TINYINT NOT NULL DEFAULT 1,
  `credentials_non_expired` TINYINT NOT NULL DEFAULT 1,
  `enabled` TINYINT NOT NULL DEFAULT 1,
  `name` VARCHAR(100) NOT NULL,
  `firstname` VARCHAR(100) NOT NULL,
  `street` VARCHAR(100) NULL,
  `street_number` VARCHAR(10) NULL,
  `postal_code` INT NULL,
  `city` VARCHAR(100) NULL,
  `country` VARCHAR(100) NULL,
  `phone_number` VARCHAR(45) NULL,
  PRIMARY KEY (`username`))
ENGINE = InnoDB

CREATE TABLE IF NOT EXISTS `domotique`.`Category` (
  `id_category` INT NOT NULL,
  `master_category` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id_category`),
  INDEX `master_category_FK_idx` (`master_category` ASC),
  CONSTRAINT `master_category_FK`
    FOREIGN KEY (`master_category`)
    REFERENCES `domotique`.`Category` (`id_category`)
)
ENGINE = InnoDB

CREATE TABLE IF NOT EXISTS `domotique`.`CategoryEN` (
  `id_category_EN` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id_category_EN`),
  CONSTRAINT `categoryEN_FK`
    FOREIGN KEY (`id_category_EN`)
    REFERENCES `domotique`.`Category` (`id_category`)
)
ENGINE = InnoDB

CREATE TABLE IF NOT EXISTS `domotique`.`CategoryFR` (
  `id_category_FR` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id_category_FR`),
  CONSTRAINT `categoryFR_FK`
    FOREIGN KEY (`id_category_FR`)
    REFERENCES `domotique`.`Category` (`id_category`)
)
ENGINE = InnoDB

CREATE TABLE IF NOT EXISTS `domotique`.`Command` (
  `id_command` INT NOT NULL,
  `submit_date` DATE NOT NULL,
  `delivery_date` DATE NULL,
  `state` INT NOT NULL,
  `id_user` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id_command`),
  INDEX `user_command_FK_idx` (`id_user` ASC),
  CONSTRAINT `user_command_FK`
    FOREIGN KEY (`id_user`)
    REFERENCES `domotique`.`User` (`username`),
  CONSTRAINT `date_CHK`
	CHECK (`submit_date` < `delivery_date`)
)
ENGINE = InnoDB

CREATE TABLE IF NOT EXISTS `domotique`.`CommandLine` (
  `id_command_line` INT NOT NULL,
  `id_command` INT NOT NULL,
  `id_product` INT NOT NULL,
  `unit_price` FLOAT NOT NULL,
  `quantity` INT NOT NULL,
  PRIMARY KEY (`id_command_line`),
  INDEX `Command_FK_idx` (`id_command` ASC),
  CONSTRAINT `Command_FK`
    FOREIGN KEY (`id_command`)
    REFERENCES `domotique`.`Command` (`id_command`),
  CONSTRAINT `unit_price_CHK`
	CHECK (`unit_price` >= 0),
  CONSTRAINT `quantity_CHK`
	CHECK (`quantity` > 0)
)
ENGINE = InnoDB

CREATE TABLE IF NOT EXISTS `domotique`.`Product` (
  `id_product` INT NOT NULL,
  `price` FLOAT NOT NULL,
  `still_available` TINYINT NOT NULL DEFAULT 1,
  PRIMARY KEY (`id_product`),
  CONSTRAINT `price_CHK`
	CHECK (`price` > 0)
 )
ENGINE = InnoDB

CREATE TABLE IF NOT EXISTS `domotique`.`ProductEN` (
  `id_product_EN` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `description` VARCHAR(500) NOT NULL,
  PRIMARY KEY (`id_product_EN`),
  CONSTRAINT `productEN_FK`
    FOREIGN KEY (`id_product_EN`)
    REFERENCES `domotique`.`Product` (`id_product`)
)
ENGINE = InnoDB

CREATE TABLE IF NOT EXISTS `domotique`.`ProductFR` (
  `id_product_FR` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `description` VARCHAR(500) NOT NULL,
  PRIMARY KEY (`id_product_FR`),
  CONSTRAINT `productFR_FK`
    FOREIGN KEY (`id_product_FR`)
    REFERENCES `domotique`.`Product` (`id_product`)
)
ENGINE = InnoDB