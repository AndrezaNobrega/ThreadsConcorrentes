
<p align="center">
 <h2 align="center">Tratamento de região crítica com Threads</h2>
 <p align="center">Nessa atividade, temos uma prática que objetiva a maior compreensão das threads, bem como a implementação do tratamento da região crítica. </p>
</p>

# Problema

Portanto, para esse estudo criamos o objeto geladeira com a capacidade de 10 litros de leite. Também, criamos uma thread BebeLeite, esta dorme por um tempo aleatório e ao acordar bebe um litro de leite. Ademais, temos as threads pai, mãe e tio as quais monitoram a geladeira e podem comprar mais leite. No entanto, ao desenvolvermos o código de maneira mais simplória, sem um controle das threads, em nossos testes, a geladeira acabou passando dos 10 litros de leite que era a sua capacidade. Logo, foi-se necessária uma solução para esse problema.

# Solução

Para isso, como solução aplicamos a classe semáforo com mutex. O qual uma técnica que utilizamos para controlar o acesso a recursos compartilhados. No caso, threads em concorrência. 

#

<p align="center">
<img src="http://img.shields.io/static/v1?label=STATUS&message=CONCLUIDO&color=GREEN&style=for-the-badge"/>
</p>
