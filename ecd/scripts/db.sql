--create database ecd;

SELECT * FROM J100 ORDER BY sk OFFSET 220 ROWS FETCH NEXT 20 ROWS ONLY;
SELECT * FROM J100 ORDER BY sk OFFSET 240 ROWS FETCH NEXT 20 ROWS ONLY;
SELECT * FROM J100 ORDER BY sk OFFSET 260 ROWS FETCH NEXT 20 ROWS ONLY;


use ecd;


--select * from I050 where codigoempresa = 1 and ano = 11 order by cod_cta

create table I050(  -- plano de contas
	sk int identity(1,1) primary key not null,
	ano tinyint not null,
	codigoempresa tinyint not null,

	cod_cta varchar(10) not null,
	cod_cta_sup varchar(10) null,
	cod_nat char(2) not null,
	nivel char(1) null,


	cod_cta_ref varchar(200) null,
	cod_agl varchar(200) null,

	constraint un_I050 unique (ano, codigoempresa, cod_cta)
	
)
go


 
--select * from J100 where codigoempresa = 1 and ano = 11 order by  nu_ordem 

create table J100(  -- balanco
	sk              int identity(1,1) primary key   not null,
	ano             tinyint                         not null,
	codigoempresa   tinyint                         not null,

	nu_ordem        tinyint                         not null,			-- para ordenar
	cod_agl 		varchar(50) 					not null,
	ind_cod_agl 	char(1) 						not null, 			-- T-totalizador, D-detalhe
	nivel_agl 		tinyint 						not null, 
	cod_agl_sup 	varchar(50) 					not null, 
	ind_grp_bal 	char(1) 						not null, 			-- A-ativo, P-passivo
	descr_cod_agl 	varchar(150) 					not null, 
	vl_cta_ini 		decimal(12, 2) 					not null default 0,
	ind_dc_cta_ini 	char(1) 						not null, 			-- D-devedor, C-credor
	vl_cta_fin 		decimal(12,2) 					not null default 0, 
	ind_dc_cta_fin 	char(1) 						not null, 			-- D-devedor, C-credor
	constraint un_J100 unique (ano, codigoempresa, cod_agl)
)
go
--select * from J150 where codigoempresa = 1 and ano=11 order by nu_ordem 


create table J150 (  -- dre
  	sk              int identity(1,1) primary key   not null,
	ano             tinyint                         not null,
	codigoempresa   tinyint                         not null,

    nu_ordem        tinyint                         not null,			-- para ordenar
    cod_agl         varchar(50)                     not null,
    ind_cod_agl     char(1)                         not null,           -- T-totalizador, D-detalhe
    nivel_agl       tinyint                         not null,
    cod_agl_sup     varchar(50)                     not null,
    descr_cod_agl   varchar(150)                    not null,
    vl_cta_ini      decimal(12, 2)                  not null default 0,
    ind_dc_cta_ini  char(1)                         not null,           -- D-devedor, C-credor
    vl_cta_fin      decimal(12, 2)                  not null default 0,
    ind_dc_cta_fin  char(1)                         not null,           -- D-devedor, C-credor
    ind_grp_dre     char(1)                         not null,           -- D-despesa, R-receita
	constraint un_J150 unique (ano, codigoempresa, cod_agl)
)
go
--select * from J210
--select * from J210 where codigoempresa = 1 and ano = 11 order by nu_ordem
create table J210 (  -- DMPL
  	sk              int identity(1,1) primary key   not null,
	ano             tinyint                         not null,
	codigoempresa   tinyint                         not null,

    nu_ordem        tinyint                         not null,			-- para ordenar

    ind_tip			char(1)							not null,			-- 0-DLPA, 1-DMPL 
	cod_agl         varchar(50)                     not null,
    descr_cod_agl   varchar(150)                    not null,
    
	vl_cta_ini      decimal(12, 2)                  not null default 0,
    ind_dc_cta_ini  char(1)                         not null,           -- D-devedor, C-credor
    vl_cta_fin      decimal(12, 2)                  not null default 0,
    ind_dc_cta_fin  char(1)                         not null           -- D-devedor, C-credor

	constraint un_J210 unique (ano, codigoempresa, cod_agl)
)
go




use ecd
go


bulk insert dbo.J150 from 'C:\import-ecd\J150 - dre\DRE.txt'
with (
	codepage = 'ACP',
	fieldterminator = ';',  
	keepidentity
);
select * from j150




bulk insert dbo.J100 from 'C:\import-ecd\J100 - balanco\balanco.txt'
with (
	codepage = 'ACP',
	fieldterminator = ';',  
	keepidentity
);
select * from J100





bulk insert dbo.I050 from 'C:\import-ecd\I050 - pl\pl.txt'
with (
	codepage = 'ACP',
	fieldterminator = ',',  
	keepidentity
);
select * from I050


