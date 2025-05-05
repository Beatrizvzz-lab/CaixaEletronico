# Caixa Eletrônico Simples

Este projeto foi desenvolvido como parte de um exercício educacional para treinar a linguagem **Java**. O objetivo principal é simular o funcionamento de um caixa eletrônico simples, com foco na funcionalidade de saque. O sistema permite ao usuário consultar saldo, realizar saques e verificar o saldo restante após a transação.

## Regras de Negócio

- **Valor Máximo para Saque**: O valor máximo para saque é **R$1000**.
- **Valor Mínimo para Saque**: O valor mínimo para saque é **R$10**.
- **Cédulas Disponíveis**: O sistema só permite saques com os seguintes múltiplos de cédulas:
  - R$10
  - R$20
  - R$50
  - R$100
- **Saldo Insuficiente**: O valor do saque não pode ultrapassar o saldo disponível da conta.
- **Saque com Múltiplos**: O valor para saque deve ser um múltiplo de 10, pois as cédulas disponíveis são múltiplas de 10.

## Funcionalidades

- **Consultar Saldo**: O usuário pode verificar o saldo atual da sua conta.
- **Sacar valor**: O usuário pode realizar saques, desde que o valor seja múltiplo de 10 e o saldo seja suficiente.
- **Encerrar Sessão**: O usuário pode encerrar a interação com o caixa eletrônico a qualquer momento.

## Como Rodar o Projeto

1. **Clone o repositório** para sua máquina local:
   ```bash
   git clone https://github.com/seuusuario/caixa-eletronico-simples.git
   ```

2. **Compile o código Java**: Certifique-se de ter o Java instalado em sua máquina e compile o código:
   ```bash
   javac Principal.java
   ```

3. **Execute o programa**: Depois de compilar o código, execute-o com o comando:
   ```bash
   java Principal
   ```

## Detalhes do Código

- **Scanner**: Usado para ler entradas do usuário.
- **Random**: Usado para gerar um saldo aleatório entre 0 e 999.
- **Estrutura de Controle**: Utilizou-se um laço `do-while` para manter o menu do caixa eletrônico ativo até que o usuário escolha a opção de sair.

### Estrutura do Menu:
1. **Consultar saldo**: Exibe o saldo atual do usuário.
2. **Sacar valor**: Permite que o usuário realize um saque, desde que o valor seja múltiplo de 10 e não ultrapasse o saldo disponível.
3. **Sair**: Encerra a interação com o programa.

## Exemplo de Execução

```plaintext
Bem-vindo ao caixa eletrônico!
Qual o nome do titular?
João Silva
Digite os números do cartão:
1234 5678 9012 3456

Menu:
1 - Consultar saldo
2 - Sacar valor
3 - Sair
Escolha uma opção: 1
Saldo atual: R$500

Menu:
1 - Consultar saldo
2 - Sacar valor
3 - Sair
Escolha uma opção: 2
Digite o valor para sacar: 100
Olá João Silva, saque de R$100.0 realizado com sucesso!
Saldo restante: R$400

Menu:
1 - Consultar saldo
2 - Sacar valor
3 - Sair
Escolha uma opção: 3
Obrigado por usar nosso caixa eletrônico!
```

