/*EX 01*/
select * from produto
where UNIDADE = 'un';

/*EX 02*/
select * from produto
where CODIGO_CLASSIFICACAO = '020' and QUANTIDADE > 20;

/*EX 03*/
select * from produto
where DESCRICAO like 'balas%'
and CODIGO_CLASSIFICACAO = '003'
and QUANTIDADE > 6;

/*EX 04*/
select * from produto
where DESCRICAO like '%martelo%' and CODIGO_CLASSIFICACAO != 'material de construção';

/*EX 05*/
select * from produto
where CODIGO_CLASSIFICACAO = '002'  and UNIDADE = 'CX' and QUANTIDADE < '5'; 

/*EX 06*/
select * from produto
where QUANTIDADE >= '10' and QUANTIDADE <= '50' and UNIDADE != 'CX' and CODIGO_CLASSIFICACAO = '002'; 
/* deu 11 item não sei como */

/*EX 07*/
select * from produto
where DESCRICAO like'%Camiseta%' and CODIGO_CLASSIFICACAO = '021' or DESCRICAO like '%bola%' and CODIGO_CLASSIFICACAO = '008'

/*EX 08*/
select QUANTIDADE from produto 
where CODIGO_CLASSIFICACAO = '003' and UNIDADE = 'PCT'

/*EX 09*/
select distinct p.UNIDADE
from produto p 
inner join classificacao c 
on p.CODIGO_CLASSIFICACAO = c.CODIGO 
where c.DESCRICAO = 'Veterinária';
/*Peguei com um outro estudante, não estava conseguindo responder*/

/*EX 10*/
select DESCRICAO, QUANTIDADE from produto
where QUANTIDADE > '6' and QUANTIDADE < '10' 

/*EX 11*/
select * from produto
where DESCRICAO like 'oleo%' and UNIDADE = 'L'

/*EX 12*/
select *, (QUANTIDADE * VALOR) as TOTAL from produto
where CODIGO_CLASSIFICACAO = '015' and UNIDADE = 'CX';