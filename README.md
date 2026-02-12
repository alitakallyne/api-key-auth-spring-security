
# 🔐 Spring Boot API Key Authentication (Spring Security )

Este projeto demonstra como implementar **autenticação via API Key**
em uma API REST utilizando **Spring Boot 3** e **Spring Security 6**,
com abordagem **stateless**, filtro customizado e controle de acesso por role.

É um projeto **didático**, ideal para estudo, portfólio e base para APIs e microserviços.

---

## 📌 Funcionalidades

- Autenticação por API Key via Header HTTP
- Filtro customizado (`OncePerRequestFilter`)
- Spring Security 6 (SecurityFilterChain)
- Autorização baseada em role (`ROLE_API`)
- API Stateless (sem sessão)
- Estrutura limpa e organizada

---

## 🧠 Conceito

A API Key funciona como um **segredo compartilhado** entre o cliente e o servidor.

Fluxo de autenticação:

```text
Client
 └── X-API-KEY
       ↓
ApiKeyAuthenticationFilter
       ↓
SecurityContext (ROLE_API)
       ↓
Controller protegido
```

---

## ⚙️ Tecnologias

- Java 17
- Spring Boot 3
- Spring Security 6
- Maven

------------------------------------------------------------------------

## 📁 Estrutura do Projeto
```text
  src/main/java/com/alita/dev/secureapi
  ├── controller
  │ └── TestController.java
  │
  ├── security
  │ ├── SecurityConfig.java
  │ └── filter
  │ └── ApiKeyAuthenticationFilter.java
  │
  ├── service
  │ └── ApiKeyService.java
  │
  └── SecureApiApplication.java
```
------------------------------------------------------------------------


## 🔧 Configuração

### application.properties

```properties
api.key=MINHA_API_KEY_SUPER_SECRETA
````


## ⚠️ Importante:
Não utilize aspas no valor da API Key, pois elas passam a fazer parte da string.


## 🔐 Como funciona a autenticação
1️⃣ Cliente envia a API Key

A chave deve ser enviada no header:

X-API-KEY: MINHA_API_KEY_SUPER_SECRETA

## 🧪Testando com Postman / cURL
- Requisição
```
GET http://localhost:8080/api/auth
```
Header:
```
X-API-KEY: MINHA_API_KEY_SUPER_SECRETA

```
- Resposta esperada
Autenticado como: api-key-client

## 🚫 Possíveis erros
- Erro	Causa
- 403 Forbidden	API Key ausente ou inválida
- Authentication null	Chave não validada
- API Key com aspas	Valor incorreto no properties
- Filter não executa	Filtro não registrado no SecurityFilterChain

## 🚀 Possíveis evoluções

- Múltiplas API Keys

- API Keys por cliente

- Rate limit por chave

- Combinar API Key + JWT

- Persistir chaves no banco de dados

## 📜 Licença
- MIT
