package org.example.ui

fun menu(){

 do{
     println("1 - Cadastrar caixa D'Agua")
     println("2 - Editar caixa D'Agua")
     println("3 - Listar caixas D'Agua")
     println("4 - Excluir caixa D'Agua")
     println("0 - Sair")

     var opcao = readln().toInt()

     when(opcao){
         1 -> println("Cadastrando caixa...")
         2 -> println("Editando caixa...")
         3 -> println("Listar caixa...")
         4 -> println("Excluindo caixa...")
         0 -> println("Saindo...")
         else -> println("Opção invalida!")
     }
 }while(opcao != 0 )
}
