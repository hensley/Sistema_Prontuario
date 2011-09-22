-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.40-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema prontuario
--

CREATE DATABASE IF NOT EXISTS prontuario;
USE prontuario;

--
-- Definition of table `autenticacao`
--

DROP TABLE IF EXISTS `autenticacao`;
CREATE TABLE `autenticacao` (
  `idAutenticacao` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `usuario` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL,
  `nome` varchar(45) NOT NULL,
  PRIMARY KEY (`idAutenticacao`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin5;

--
-- Dumping data for table `autenticacao`
--

/*!40000 ALTER TABLE `autenticacao` DISABLE KEYS */;
INSERT INTO `autenticacao` (`idAutenticacao`,`usuario`,`senha`,`nome`) VALUES 
 (1,'jordana','123',''),
 (2,'jordana','123',''),
 (3,'uuu','98989898',''),
 (4,'jordana','123',''),
 (5,'','',''),
 (6,'di','123','diawana');
/*!40000 ALTER TABLE `autenticacao` ENABLE KEYS */;


--
-- Definition of table `familia`
--

DROP TABLE IF EXISTS `familia`;
CREATE TABLE `familia` (
  `idfamilia` int(11) NOT NULL AUTO_INCREMENT,
  `bairro` varchar(255) DEFAULT NULL,
  `cep` varchar(255) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  `data_cadastro` varchar(255) DEFAULT NULL,
  `logradouro` varchar(255) DEFAULT NULL,
  `numero` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idfamilia`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `familia`
--

/*!40000 ALTER TABLE `familia` DISABLE KEYS */;
INSERT INTO `familia` (`idfamilia`,`bairro`,`cep`,`cidade`,`complemento`,`data_cadastro`,`logradouro`,`numero`) VALUES 
 (1,'/','/','/','/','/','/','/'),
 (2,'/','/','/','/','/','/','/'),
 (3,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (4,'/','/','/','/','/','/','/'),
 (5,'/','/','/','/','/','/','/'),
 (6,'/','/','/','/','/','/','/'),
 (7,'/','/','/','/','/','/','/'),
 (8,'/','/','/','/','/','/','/'),
 (9,'jk','88','sjp','casa','99','Capitão Militão','12'),
 (10,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (11,'/','/','/','/','/','','/'),
 (12,'qq','11111-111','qq',NULL,NULL,NULL,'11'),
 (13,'kajdf','11111-111','ninheira',NULL,NULL,NULL,'22'),
 (14,'uuu','11111-111','uu',NULL,NULL,NULL,'uuu'),
 (15,'ww','22222-222','ww','ww','33/33/3333',NULL,'ww'),
 (16,'akjf','99999-999','','akdfj','99/99/9999','kzdjf','kajf'),
 (17,'rr','33333-333','rrr','rr','11/11/1111','rrrrrrrrrr','rr');
/*!40000 ALTER TABLE `familia` ENABLE KEYS */;


--
-- Definition of table `gestante`
--

DROP TABLE IF EXISTS `gestante`;
CREATE TABLE `gestante` (
  `idgestante` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `recen` varchar(45) DEFAULT NULL,
  `aborto` varchar(45) DEFAULT NULL,
  `estadocivil` varchar(45) DEFAULT NULL,
  `gestacaoant` varchar(45) DEFAULT NULL,
  `dum` varchar(45) DEFAULT NULL,
  `dpp` varchar(45) DEFAULT NULL,
  `paciente` int(11) DEFAULT NULL,
  PRIMARY KEY (`idgestante`) USING BTREE,
  KEY `FK_gestante_1` (`paciente`),
  CONSTRAINT `FK_gestante_1` FOREIGN KEY (`paciente`) REFERENCES `paciente` (`idPaciente`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gestante`
--

/*!40000 ALTER TABLE `gestante` DISABLE KEYS */;
INSERT INTO `gestante` (`idgestante`,`recen`,`aborto`,`estadocivil`,`gestacaoant`,`dum`,`dpp`,`paciente`) VALUES 
 (1,'',NULL,'','','','',NULL),
 (2,'',NULL,'','','','',NULL),
 (3,'oaskfoak',NULL,'df','df','df','df',NULL),
 (4,'',NULL,'','','','',NULL),
 (5,'',NULL,'','','','',NULL),
 (6,'nao',NULL,'casada','sim','11/11/2011','1312131',NULL),
 (7,'sdf',NULL,'af','adf','af','adf',NULL),
 (8,'',NULL,'','','','',NULL),
 (9,'kk',NULL,'kk','ll','kk','kk',NULL),
 (10,'',NULL,'','','','',NULL),
 (11,'akjf',NULL,'asjf','aksdjf','dk','kajf',NULL),
 (12,'não',NULL,'solteira','sim','8888','877',NULL),
 (13,'','','','','','',NULL),
 (14,'sim','sim','sim','sim','sim','sim',1),
 (15,'kk','kk','kk','kk','kk','kk',2);
/*!40000 ALTER TABLE `gestante` ENABLE KEYS */;


--
-- Definition of table `paciente`
--

DROP TABLE IF EXISTS `paciente`;
CREATE TABLE `paciente` (
  `idPaciente` int(11) NOT NULL AUTO_INCREMENT,
  `profissao` varchar(255) DEFAULT NULL,
  `data_nascimento` varchar(255) DEFAULT NULL,
  `idade` varchar(255) DEFAULT NULL,
  `idFamilia` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `sexo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idPaciente`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `paciente`
--

/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` (`idPaciente`,`profissao`,`data_nascimento`,`idade`,`idFamilia`,`nome`,`sexo`) VALUES 
 (1,NULL,NULL,NULL,NULL,NULL,NULL),
 (2,'','','','','kaj','VAZIO'),
 (3,'','','','','','VAZIO'),
 (4,'','','','','kjv','VAZIO'),
 (5,'','','29','','ajdjaksdjf','VAZIO'),
 (6,'','','','','fulano.. fulano','VAZIO'),
 (7,'','','','','kkjaksjdf','VAZIO'),
 (8,'','','','','','VAZIO'),
 (9,'kdjf','9990909','11','9','kajdfkj','masculino'),
 (10,NULL,NULL,'11_',NULL,'ooo',NULL),
 (11,NULL,NULL,'111',NULL,'ooo','Feminino'),
 (12,NULL,NULL,'122',NULL,'luiz','Masculino'),
 (13,NULL,NULL,'222',NULL,'luiz','Masculino'),
 (14,NULL,NULL,'444',NULL,'LUIZ','Masculino'),
 (15,NULL,'27/04/1992','191',NULL,'LUIZ CLAUDIO','Masculino'),
 (16,'ASF','90/90/9099','121',NULL,'OOOPOPO','Masculino'),
 (17,'jj','11/11/1111','111',NULL,'jodan','Feminino'),
 (18,'ooooo','99/99/9999','999',NULL,'oooopp',NULL);
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;


--
-- Definition of table `pacientetest`
--

DROP TABLE IF EXISTS `pacientetest`;
CREATE TABLE `pacientetest` (
  `idPaciente` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `profissao` varchar(45) NOT NULL,
  `data_nascimento` varchar(45) NOT NULL,
  `idade` varchar(45) NOT NULL,
  `famiia` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `sexo` varchar(45) NOT NULL,
  PRIMARY KEY (`idPaciente`),
  KEY `FK_pacientetest_1` (`famiia`),
  CONSTRAINT `FK_pacientetest_1` FOREIGN KEY (`famiia`) REFERENCES `familia` (`idfamilia`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pacientetest`
--

/*!40000 ALTER TABLE `pacientetest` DISABLE KEYS */;
/*!40000 ALTER TABLE `pacientetest` ENABLE KEYS */;


--
-- Definition of table `pessoa`
--

DROP TABLE IF EXISTS `pessoa`;
CREATE TABLE `pessoa` (
  `idpessoa` int(11) NOT NULL AUTO_INCREMENT,
  `profissao` varchar(255) DEFAULT NULL,
  `bairro` varchar(255) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  `conselho_classe` varchar(255) DEFAULT NULL,
  `cpf` varchar(255) DEFAULT NULL,
  `data_nascimento` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `logradouro` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `numero` varchar(255) DEFAULT NULL,
  `rg` varchar(255) DEFAULT NULL,
  `sexo` varchar(255) DEFAULT NULL,
  `telefone_celular` varchar(255) DEFAULT NULL,
  `telefone_fixo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idpessoa`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pessoa`
--

/*!40000 ALTER TABLE `pessoa` DISABLE KEYS */;
INSERT INTO `pessoa` (`idpessoa`,`profissao`,`bairro`,`cidade`,`complemento`,`conselho_classe`,`cpf`,`data_nascimento`,`estado`,`logradouro`,`nome`,`numero`,`rg`,`sexo`,`telefone_celular`,`telefone_fixo`) VALUES 
 (1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (2,'Dentista','adf','adf','casa','232323','898','33','MINAS GERAIS','ajf','Jordana Cayres','1','15234343','VAZIO','iu32u','999'),
 (3,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `pessoa` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
