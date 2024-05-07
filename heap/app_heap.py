from Tarefa import Task
import heapq

lista_tarefas = []

def menu():
     print('-'*10)
     print('1- Adicionar Tarefa')
     print('2- Realizar Tarefa(Remover)')
     print('3- Consultar Tarefa')
     print('4- sair')

def adicionar():
     titulo = input('digite o titulo: ')
     descricao = input('digite a descrição: ')
     obj = Task(titulo)
     obj.set_descricao(descricao)
     prioridade = obj.get_prioridade()
     heapq.heappush(lista_tarefas,(prioridade,obj))

def consultar():
     for item in lista_tarefas:
          print(item[1].info())

def realizar():
     if len(lista_tarefas)>0:
          tarefa = heapq.heappop(lista_tarefas)
          # a tarefa de MAIOR prioridade
          print(tarefa[1].info())
     else:
          print('Não tem tarefa')


if __name__ =='__main__':
     opcao = 1
     while opcao != 4:
          menu()
          opcao = int(input('Digite a opção: '))
          if opcao == 1:
               adicionar()
          elif opcao == 2:
               realizar()
          elif opcao ==3:
               consultar()
          elif opcao ==4:
               print('saindo')
          else:
               print('opção incorreta')