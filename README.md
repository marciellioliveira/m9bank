# m9bank

# Parte 1 do Projeto: https://github.com/marciellioliveira/BancoDigital_Parte1

### O Projeto

Você montou uma startup que desenvolve softwares para clientes. Seu primeiro cliente é de uma instituição financeira e quer um software na web que seja capaz de cadastrar dados de seus clientes como CPF, Nome, Data de nascimento e Endereço. Os clientes podem ser subdivididos em três categorias: Comum, Super e Premium e podem abrir contas de dois tipos: corrente e poupança, devendo estas realizar ações básicas, como exibir saldo e fazer transferências via Pix. A conta corrente possui uma taxa mensal de manutenção que deve ser descontada a cada mês e a conta poupança deve fazer o acréscimo conforme a taxa de rendimento no momento.
- **Youtube:** https://www.youtube.com/watch?v=jwnL02cOuic&ab_channel=TecGirl
  
### Regras de Negócio

1. **Cadastro de Clientes:** O sistema deve permitir o cadastro de novos clientes com CPF, nome, data de nascimento e endereço, classificando-os em categorias Comum, Super ou Premium.
2. **Contas Bancárias:** Os clientes podem abrir contas correntes e/ou poupança, cada uma com funcionalidades específicas:
   - Conta Corrente: Deve ter uma taxa de manutenção mensal descontada automaticamente.
   - Conta Poupança: Deve creditar mensalmente o rendimento conforme a taxa vigente.
3. **Operações Bancárias:** Implementar funcionalidades para exibição de saldo, transferências via Pix, e outras operações básicas.
4. **Cartões de Crédito e Débito:** Emitir cartões vinculados às contas dos clientes, permitindo operações de pagamento, alteração de senha, ativação/desativação e ajuste de limites.
     - Cartão de Crédito: Deve ter um limite pré-aprovado e bloquear novos pagamentos ao atingir o limite.
     - Cartão de Débito: Deve ter um limite diário de transações, podendo ser ajustado pelo usuário.
5. **Seguros de Cartão de Crédito:** Oferecer produtos de seguro específicos para cartões de crédito, gerando apólices eletrônicas com detalhes sobre cobertura e condições.
  
### Validação de Campos na Inserção do Usuário: 

1. **CPF:** - Deve ser único para cada cliente. Validar o formato (xxx.xxx.xxx-xx) e a autenticidade usando um algoritmo de validação de CPF.
2. **Nome:** - Deve conter apenas letras e espaços. Comprimento mínimo de 2 caracteres e máximo de 100 caracteres.
3. **Data de Nascimento:** - Deve ser uma data válida no formato DD/MM/AAAA . O cliente deve ser maior de idade (≥ 18 anos) com base na data atual.
4. **Endereço:** - Deve incluir rua, número, complemento (se aplicável), cidade, estado e CEP. Verificar se o formato do CEP é válido (xxxxx-xxx).

### Contas Bancárias e Taxas: 

1. **Conta Corrente:**
   - **Taxa de Manutenção Mensal:** R$ 12,00 para clientes Comuns, R$ 8,00 para clientes Super e isenta para clientes Premium.
2. **Conta Poupança:**:**Taxa de Rendimento Anual:** 0,5% ao ano para clientes Comuns, 0,7% ao ano para clientes Super, e 0,9% ao ano para clientes Premium. O rendimento é calculado mensalmente usando a fórmula do juro composto, baseando-se no saldo presente na conta no último dia do mês.

### Cartões: 
1. Cartão de Crédito,
2. Limite de Crédito.
   
- Deve ser definido com base no cliente, 1 mil (COMUM), 5 mil (SUPER), 10 mil (PREMIUM).
- Taxa de Utilização: 5% sobre o total gasto no mês, aplicável apenas se o total de gastos exceder 80% do limite de crédito.

### Seguros de Cartão de Crédito:
**--- Seguro Viagem:** Gratuito para clientes Premium; opcional para clientes Comum e Super, com taxa de R$ 50,00 por mês.
**--- Seguro de Fraude:** Cobertura automática para todos os cartões, com um valor de apólice base de R$ 5.000,00.

### Status do Projeto:
🚧 Projeto em Andamento 🚧

### Tecnologia/Linguagem
O sistema utiliza a seguinte tecnologia/linguagem:
- Java 21

### Objetivos
O objetivo principal do sistema é fornecer uma aplicação backend simples para gerenciamento de um banco digital.

### Funcionalidades
**Menu Principal**
- Cadastro de Cliente
- Listar Clientes
- Remover Clientes
- Abrir conta
- Listar Cartões
- Listar Contas
- Listar taxas/descontos
- Emitir Cartão
- Fazer transferência
- Sair
- 
**Cadastro de Cliente - Validações**
- Campos vazios
- Data de Nascimento
- CPF com formatação e validação
- CEP com formatação
- Se cliente já possui cadastro

**Abertura de conta**
- Verificação de Cadastro do cliente
- Abertura Conta Corrente / Poupança

### Endpoints da API Banco Digital
#### Cliente
- **POST /clientes** - Criar um novo cliente
- **GET /clientes/{id}** - Obter detalhes de um cliente
- **PUT /clientes/{id}** - Atualizar informações de um cliente
- **DELETE /clientes/{id}** - Remover um cliente
- **GET /clientes** - Listar todos os clientes

#### Conta
- **POST /contas** - Criar uma nova conta
- **GET /contas/{id}** - Obter detalhes de uma conta
- **POST /contas/{id}/transferencia** - Realizar uma transferência entre contas
- **GET /contas/{id}/saldo** - Consultar saldo da conta
- **POST /contas/{id}/pix** - Realizar um pagamento via Pix
- **POST /contas/{id}/deposito** - Realizar um depósito na conta
- **POST /contas/{id}/saque** - Realizar um saque da conta
- **PUT /contas/{id}/manutencao** - Aplicar taxa de manutenção mensal (para conta
corrente)
- **PUT /contas/{id}/rendimentos** - Aplicar rendimentos (para conta poupança)
- 
#### Cartão
- **POST /cartoes** - Emitir um novo cartão
- **GET /cartoes/{id}** - Obter detalhes de um cartão
- **POST /cartoes/{id}/pagamento** - Realizar um pagamento com o cartão
- **PUT /cartoes/{id}/limite** - Alterar limite do cartão
- **PUT /cartoes/{id}/status** - Ativar ou desativar um cartão
- **PUT /cartoes/{id}/senha** - Alterar senha do cartão
- **GET /cartoes/{id}/fatura** - Consultar fatura do cartão de crédito
- **POST /cartoes/{id}/fatura/pagamento** - Realizar pagamento da fatura do cartão
de crédito
- **PUT /cartoes/{id}/limite-diario** - Alterar limite diário do cartão de débito
  
#### Seguro - (opcional)
- **POST /seguros** - Contratar um seguro
- **GET /seguros/{id}** - Obter detalhes de uma apólice de seguro
- **GET /seguros** - Listar todos os seguros disponíveis
- **PUT /seguros/{id}/cancelar** - Cancelar uma apólice de seguro

### OPCIONAL
- Autenticação e Autorização
- Implementar Spring Security para autenticação via JWT.
- Criar diferentes roles (ex: ADMIN e CLIENTE) com permissões distintas.

### Sugestões de Integração com Outras APIs (requisições HTTP usando RestTemplate ou WebClient no Spring Boot)
**1. Consulta de CPF na Receita Federal**
- Consumir uma API externa para validar se o CPF do cliente está correto e ativo.
- Pode-se usar APIs públicas ou simular uma própria API de validação.
**2. Cotação de Moedas e Taxas de Câmbio** 
- Integrar com uma API de câmbio (ex: Open Exchange Rates, Banco Central)
para permitir conversões monetárias.

### Como executar
- Instale o Eclipse/NetBeans e/ou programa de sua preferência e rodar o programa.

### 1. Clone o Repositório:
- Clone o repositório no seu diretório local,
- git clone marciellioliveira/BancoDigital_Parte1

### Dependências
- Certifique-se de que o Maven está instalado em seu sistema.
- No terminal, execute o comando a seguir para baixar as dependências do Maven: mvn clean install
