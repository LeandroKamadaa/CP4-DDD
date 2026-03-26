# CP4 - Restaurante DDD API (Simplificada)

Este projeto implementa o Checkpoint 3 de Domain-Driven Design de forma simplificada, focando exclusivamente nas ações de domínio e respostas semânticas.

## Arquitetura
A API foi desenhada para ser 100% **Stateless**, retornando mensagens de texto que confirmam cada ação realizada no fluxo de um pedido de restaurante.

## Endpoints de Ação

*   `POST /orders/iniciar`: Inicia um novo ciclo de vida.
*   `POST /orders/adicionar-item`: Adiciona itens ao pedido.
*   `POST /orders/confirmar`: Envia o pedido para a cozinha.
*   `POST /orders/preparar`: Inicia o preparo.
*   `POST /orders/finalizar`: Conclui o preparo.
*   `POST /orders/entregar`: Entrega ao cliente.
*   `POST /orders/cancelar`: Cancela o pedido.

## Como Testar (IntelliJ)
1.  Execute a classe `DemoApplication`.
2.  Abra o arquivo `api_test.http`.
3.  Clique nos ícones verdes ao lado de cada rota para ver as mensagens de retorno.

## Decisões de Projeto
*   **Abordagem Simples:** Removida a necessidade de persistência ou envio de JSON complexo, focando na semântica das rotas.
*   **Estratatégia Stateless:** Cada requisição é independente e confirma a ação solicitada via String.
