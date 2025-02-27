# Sistema de Reserva de Hotel em Java 

##  Descrição
Este projeto consiste em um programa Java que permite a gestão de reservas de hotel. O sistema permite:
- Cadastrar uma nova reserva informando número do quarto, data de entrada e data de saída.
- Exibir os detalhes da reserva, incluindo a duração da estadia em dias.
- Atualizar as datas da reserva, obedecendo regras de validação.

##  Regras de Validação
O sistema garante que os dados informados sejam válidos seguindo as seguintes regras:
1. **A data de saída deve ser maior que a data de entrada.**
2. **As alterações de reserva só podem ser feitas para datas futuras.**

Caso os dados informados sejam inválidos, uma mensagem de erro será exibida e o usuário deverá inserir novas datas.

##  Tecnologias Utilizadas
- Java SE 8+
- Manipulação de datas com **LocalDate** e **DateTimeFormatter**
- Tratamento de exceções para garantir a integridade das informações


##  Exemplo de Uso
```
Digite o número do quarto: 101
Digite a data de entrada (dd/MM/yyyy): 10/03/2025
Digite a data de saída (dd/MM/yyyy): 15/03/2025

Reserva: Quarto 101, Check-in: 10/03/2025, Check-out: 15/03/2025, Duração: 5 dias

Digite as novas datas de reserva:
Check-in: 12/03/2025
Check-out: 18/03/2025

Reserva atualizada: Quarto 101, Check-in: 12/03/2025, Check-out: 18/03/2025, Duração: 6 dias
```

##  Objetivo do Exercício
Este exercício reforça conceitos importantes da programação orientada a objetos (POO), como:
- Encapsulamento e manipulação de atributos privados
- Uso de classes e objetos para modelagem de problemas reais
- Tratamento de exceções e entrada de dados
- Manipulação de datas com a API de datas do Java

