import java.util.Scanner;

public class CarrinhoDeCompras_Equipe6 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String opcao;
        boolean finalizar = false;

        String produtos[] = {"Arroz", "Feijão", "Açúcar", "Café", "Macarrão"};
        int contador[] = {0};
        int quantidade[] = {12, 15, 23, 8, 17};
        double valor[] = {7.50, 10.99, 4.99, 24.75, 3.49};
        int carrinho[] = new int[5];
        int finalizador[] = {0};

        System.out.println("===============================================================");
        System.out.println("             SIMULADOR DE CARRINHO DE COMPRAS                  ");
        do {
            System.out.println("===============================================================");
            System.out.println("1 - Catálogo");
            System.out.println("2 - Compra");
            System.out.println("3 - Exibir carrinho");
            System.out.println("4 - Editar Compra");
            System.out.println("5 - Finalizar Compra");
            System.out.println("===============================================================");
            System.out.print("Selecione uma das opções acima: ");
            opcao = input.next();

            switch (opcao) {
                case "1": 
                    catalogo(produtos, quantidade, valor);
                    break;

                case "2": 
                    compra(quantidade, input, carrinho, valor, contador);
                    break;

                case "3": 
                    System.out.println("===============================================================");
                    for (int i = 0; i < carrinho.length; i++) {
                        System.out.println("Produto: " + produtos[i] + ", tem no carrinho: " + carrinho[i]);
                    }
                    break;

                case "4": 
                    editar(quantidade, carrinho, input, contador);
                    break;

                case "5":
                    finalizarCompra(produtos, valor, carrinho, input, finalizador); 
                    if (finalizador[0] == 1) {
                        finalizar = true;
                    }
                    break;
            }
        } while (!finalizar);

    }

    public static void catalogo(String produtos[], int quantidade[], double valor[]) {
        System.out.println("===============================================================");
        System.out.println("ID|PRODUTOS|VALOR |QUANTIDADE");
        System.out.println("1 |" + produtos[0] + "   |" + valor[0] + "   |" + quantidade[0]);
        System.out.println("2 |" + produtos[1] + "  |" + valor[1] + " |" + quantidade[1]);
        System.out.println("3 |" + produtos[2] + "  |" + valor[2] + "  |" + quantidade[2]);
        System.out.println("4 |" + produtos[3] + "    |" + valor[3] + " |" + quantidade[3]);
        System.out.println("5 |" + produtos[4] + "|" + valor[4] + "  |" + quantidade[4]);
    }

    public static void compra(int quantidade[], Scanner input, int carrinho[], double valor[], int contador[]) {
        String opcao;
        boolean sair = false;
        int compra = 0;

        do {
            System.out.println("===============================================================");
            System.out.print("Digite o ID do produto que o cliente comprou (S p/ sair): ");
            opcao = input.next();

            switch (opcao.toLowerCase()) {
                case "1":
                    System.out.println("===============================================================");
                    System.out.print("Digite quantos do produto o cliente comprou: ");
                    compra = input.nextInt();
                    if (compra <= quantidade[0]) {
                        if (contador[0] + compra <= 20) {
                            carrinho[0] += compra;
                            quantidade[0] -= compra;
                            contador[0] += compra;
                        } else {
                            System.out.println("Esta quantidade ultrapassa o limite de 20 produtos no carrinho.");
                        }
                    } else {
                        System.out.print("Não possuimos essa quantidade do estoque.");
                    }
                    break;
                case "2":
                    System.out.println("===============================================================");
                    System.out.print("Digite quantos do produto o cliente comprou: ");
                    compra = input.nextInt();
                    if (compra <= quantidade[1]) {
                        if (contador[0] + compra <= 20) {
                            carrinho[1] += compra;
                            quantidade[1] -= compra;
                            contador[0] += compra;
                        } else {
                            System.out.println("Esta quantidade ultrapassa o limite de 20 produtos no carrinho.");
                        }
                    } else {
                        System.out.print("Não possuimos essa quantidade do estoque.");
                    }
                    break;
                case "3":
                    System.out.println("===============================================================");
                    System.out.print("Digite quantos do produto o cliente comprou: ");
                    compra = input.nextInt();
                    if (compra <= quantidade[2]) {
                        if (contador[0] + compra <= 20) {
                            carrinho[2] += compra;
                            quantidade[2] -= compra;
                            contador[0] += compra;
                        } else {
                            System.out.println("Esta quantidade ultrapassa o limite de 20 produtos no carrinho.");
                        }
                    } else {
                        System.out.print("Não possuimos essa quantidade do estoque.");
                    }
                    break;
                case "4":
                    System.out.println("===============================================================");
                    System.out.print("Digite quantos do produto o cliente comprou: ");
                    compra = input.nextInt();
                    if (compra <= quantidade[3]) {
                        if (contador[0] + compra <= 20) {
                            carrinho[3] += compra;
                            quantidade[3] -= compra;
                            contador[0] += compra;
                        } else {
                            System.out.println("Esta quantidade ultrapassa o limite de 20 produtos no carrinho.");
                        }
                    } else {
                        System.out.println("Não possuimos essa quantidade do estoque.");
                    }
                    break;
                case "5":
                    System.out.println("===============================================================");
                    System.out.print("Digite quantos do produto o cliente comprou: ");
                    compra = input.nextInt();
                    if (compra <= quantidade[4]) {
                        if (contador[0] + compra <= 20) {
                            carrinho[4] += compra;
                            quantidade[4] -= compra;
                            contador[0] += compra;
                        } else {
                            System.out.println("Esta quantidade ultrapassa o limite de 20 produtos no carrinho.");
                        }
                    } else {
                        System.out.print("Não possuimos essa quantidade do estoque.");
                    }
                    break;
                case "s":
                    sair = true;
                    break;
                default:
                    System.out.println("===============================================================");
                    System.out.println("DIGITE UM VALOR VÁLIDO!");
                    break;
            }

            System.out.println("Quantidade de produtos no carrinho: " + contador[0]);

            if (contador[0] >= 20) {
                sair = true;
                System.out.println("O carrinho está no limite!");
            }

        } while (sair == false);
    }

    public static void editar(int quantidade[], int carrinho[], Scanner input, int contador[]) {
        String opcao;
        boolean sair = false;
        int editar;

        do {
            System.out.println("===============================================================");
            System.out.print("Digite o ID do produto que será editado (S p/ sair): ");
            opcao = input.next();

            switch (opcao.toLowerCase()) {
                case "1":
                    System.out.println("===============================================================");
                    System.out.print("Digite a quantidade que será removida do produto: ");
                    editar = input.nextInt();

                    if (editar > 0 && carrinho[0] > 0) {
                        carrinho[0] = carrinho[0] - editar;
                        contador[0] = contador[0] - editar;
                        quantidade[0] = quantidade[0] + editar;
                    } else {
                        System.out.println("===============================================================");
                        System.out.println("Digite um valor válido ou coloque produtos no carrinho");
                    }
                    break;

                case "2":
                    System.out.println("===============================================================");
                    System.out.print("Digite a quantidade que será removida do produto: ");
                    editar = input.nextInt();

                    if (editar > 0 && carrinho[1] > 0) {
                        carrinho[1] = carrinho[1] - editar;
                        contador[0] = contador[0] - editar;
                        quantidade[1] = quantidade[1] + editar;
                    } else {
                        System.out.println("===============================================================");
                        System.out.println("Digite um valor válido ou coloque produtos no carrinho");
                    }
                    break;

                case "3":
                    System.out.println("===============================================================");
                    System.out.print("Digite a quantidade que será removida do produto: ");
                    editar = input.nextInt();

                    if (editar > 0 && carrinho[2] > 0) {
                        carrinho[2] = carrinho[2] - editar;
                        contador[0] = contador[0] - editar;
                        quantidade[2] = quantidade[2] + editar;
                    } else {
                        System.out.println("===============================================================");
                        System.out.println("Digite um valor válido ou coloque produtos no carrinho");
                    }
                    break;

                case "4":
                    System.out.println("===============================================================");
                    System.out.print("Digite a quantidade que será removida do produto: ");
                    editar = input.nextInt();

                    if (editar > 0 && carrinho[3] > 0) {
                        carrinho[3] = carrinho[3] - editar;
                        contador[0] = contador[0] - editar;
                        quantidade[3] = quantidade[3] + editar;
                    } else {
                        System.out.println("===============================================================");
                        System.out.println("Digite um valor válido ou coloque produtos no carrinho");
                    }
                    break;

                case "5":
                    System.out.println("===============================================================");
                    System.out.print("Digite a quantidade que será removida do produto: ");
                    editar = input.nextInt();

                    if (editar > 0 && carrinho[4] > 0) {
                        carrinho[4] = carrinho[4] - editar;
                        contador[0] = contador[0] - editar;
                        quantidade[4] = quantidade[4] + editar;
                    } else {
                        System.out.println("===============================================================");
                        System.out.println("Digite um valor válido ou coloque produtos no carrinho");
                    }
                    break;

                case "s":
                    sair = true;
                    break;

                default:
                    System.out.println("===============================================================");
                    System.out.println("DIGITE UM VALOR VÁLIDO!");
                    break;
            }

        } while (!sair);
    }

    public static void finalizarCompra(String produtos[], double valor[], int carrinho[], Scanner input, int finalizador[]) {
        double recibo[] = new double[5];
        double valorTotal = 0;
        double desconto;
        String opcao;
        boolean sair = false;

        System.out.println("===============================================================");
        System.out.println("1 - O cliente possui cupom de desconto");
        System.out.println("2 - O cliente NÃO possui cupom de desconto");
        System.out.println("===============================================================");
        System.out.print("Digite alguma das opções acima (ou S p/ sair): ");
        opcao = input.next();

        do {
            switch (opcao.toLowerCase()) {
                case "1":
                    for (int i = 0; i < 5; i++) {
                        recibo[i] = carrinho[i] * valor[i];
                        valorTotal += recibo[i];
                    }
                    desconto = valorTotal * 0.2;
                    valorTotal = valorTotal - desconto;
                    System.out.printf("Compra Finalizada! O valor total foi de: R$ %.2f%n", valorTotal);
                    finalizador[0]++;
                    sair = true;
                    break;

                case "2":
                    for (int i = 0; i < 5; i++) {
                        recibo[i] = carrinho[i] * valor[i];
                        valorTotal += recibo[i];
                    }
                    System.out.printf("Compra Finalizada! O valor total foi de: R$ %.2f%n", valorTotal);
                    finalizador[0]++;
                    sair = true;
                    break;

                case "s":
                    sair = true;
                    break;

                default:
                    System.out.println("===============================================================");
                    System.out.println("DIGITE UM VALOR VÁLIDO");
                    sair = true;
                    break;
            }
        } while (!sair);
    }
}