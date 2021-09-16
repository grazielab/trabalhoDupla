
// Graziela Bartyra Bressanini Beckhauser
// Cintia Maria

import java.util.Scanner;

public class cadastroDev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean invalido = true;

        System.out.println(" Bem-vindo a área de cadastros! \n");
        System.out.println("Selecione a opção desejada \n");

        System.out.println("\t 1 - Cadastrar Desenvolvedor(a)");
        System.out.println("\t 2 - Cadastrar Linguagem");
        System.out.println("\t 3 - Sair");

        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao){
            case 1:
                String nome = "";
                String sobrenome = "";
                int idade;

                System.out.println("Cadastro");
                do{
                    System.out.println("Digite seu nome: \n");
                    nome = sc.nextLine();
                    if (nome.length() < 3) {
                        System.out.println("O nome deve conter mais de 3 caracteres.");
                        System.out.println("Digite novamente seu nome: ");
                    }else{
                        invalido = false;
                    }
                }while (invalido);
                invalido = true;

                do{
                    System.out.println("Digite seu sobrenome: \n");
                    sobrenome = sc.nextLine();
                    if (sobrenome.length() < 3) {
                        System.out.println("O sobrenome deve conter mais de 3 caracteres.");
                        System.out.println("Digite novamente seu sobrenome: ");
                    }else{
                        invalido = false;
                    }
                }while (invalido);
                invalido = true;

                do{
                    System.out.println("Digite sua idade: \n");
                    idade = sc.nextInt();
                    sc.nextLine();
                    if (idade <= 0) {
                        System.out.println("A sua idade deve ser maior que zero.");
                        System.out.println("Digite novamente sua idade: ");
                    }else{
                        invalido = false;
                    }
                }while (invalido);

                System.out.println("Digite sua senioridade: ");
                String senioridade = sc.nextLine();

                break;

            case 2:

                String nomeLinguagem = "";
                String descLinguagem = "";

                System.out.println("Cadastro de Linguagens");
                do{
                    System.out.println("Digite o nome da Linguagem: \n");
                    nomeLinguagem = sc.nextLine();
                    if (nomeLinguagem.length() < 3) {
                        System.out.println("O nome da linguagem deve conter mais de 3 caracteres.");
                        System.out.println("Digite novamente: ");
                    }else{
                        invalido = false;
                    }
                }while (invalido);
                invalido = true;

                System.out.println("Digite a descrição da linguagem: ");
                descLinguagem = sc.nextLine();

                int ap = 0;
                do {
                    System.out.println("Digite a sua aplicação: ");
                    System.out.println("\t 1 - Frontend");
                    System.out.println("\t 2 - Backend");
                    System.out.println("\t 3 - Mobile");
                    ap = sc.nextInt();
                    if(ap < 0 || ap > 3) {
                        System.out.println("Opção inválida. Digite novamente: ");
                    }
                    else{
                        invalido = false;
                    }
                }while(invalido);

                System.out.println("Cadastro concluido com sucesso!! \n");
                System.out.println("Nome Linguagem: " + nomeLinguagem);
                System.out.println("Descrição:" + descLinguagem );
                System.out.println("Aplicação: " + ap);

                break;

            case 3:
                System.out.println("Saindo ...");
                break;
          //  default:

        }
    }
}

