#language:pt

Funcionalidade: Login

  // Obs: Deve-se tirar todos os acentos das palavras dos steps
  // ctrl + alt + l - organiza todo os códigos

  Contexto: // O item se repete em todos os steps
    Dado que o modal esteja sendo exibida

  Cenario: Fechar a modal ao clicar fora da mesma
  // Dado que o modal esteja sendo exibida
    Quando for realizado um clique fora do modal
    Entao a janela modal deve ser fechada

  Cenario: Fechar a modal ao clicar no ícone fechar
  // Dado que o modal esteja sendo exibida
    Quando for realizado um clique no icone de fechar o modal
    Entao a janela modal deve ser fechada

  Cenario: Link Create New Account
  // Dado que o modal esteja sendo exibida
    Quando for realizado um clique no link Create New Account
    Entao a pagina Create New Account deve ser exibida

  Esquema do Cenario: Realizar login <identificacao>
  // Dado que o modal esteja sendo exibida
    Quando os campos de login sejam preenchidos da seguinte forma:
      | Login    | <login>    |
      | Password | <password> |
      | remember | <remember> |
    Quando for realizado o clique no botao Sign in
    Entao deve ser possivel logar no sistema

    Exemplos:
      | identificacao       | login   | password | remember |
      | campos obrigatorios | Rodrigo | senha    | false    |
      | todos os campos     | Rodrigo | senha    | true     |

  Esquema do Cenario: Realizar login com <identificacao>
  // Dado que o modal esteja sendo exibida
    Quando os campos de login sejam preenchidos da seguinte forma:
      | Login    | <login>    |
      | Password | <password> |
      | remember | <remember> |
    Quando for realizado o clique no botao Sign in
    Entao o sistema devera exibir uma mensagem de erro

    Exemplos:
      | identificacao    | login    | password | remember |
      | usuario invalido | invalido | senha    | false    |
      | senha invalida   | Rodrigo  | invalido | false    |

  Esquema do Cenario: Realizar login com <identificacao>
  // Dado que o modal esteja sendo exibida
    Quando os campos de login sejam preenchidos da seguinte forma:
      | Login    | <login>    |
      | Password | <password> |
      | remember | <remember> |
    Entao o botao Sign in deve permanecer desabilitado

    Exemplos:
      | identificacao     | login   | password | remember |
      | usuario em branco |         | senha    | false    |
      | senha em branco   | Rodrigo |          | false    |


