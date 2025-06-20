import java.util.Scanner;
public class ApresentacaoPOO {
    public interface IReprodutorMusical {
        String selecionarMusica(String musica);
        String tocar();
        String pausar();
    }
    public interface IAparelhoTelefonico {
        String ligar(String numero);
        String atender();
        String iniciarCorreioVoz();
    }
    public interface INavegadorInternet {
        String exibirPagina(String url);
        String adicionarNovaAba();
        String atualizarPagina();
    }
    public static class Iphone implements IReprodutorMusical,IAparelhoTelefonico,INavegadorInternet {
        // Implementação dos métodos de IReprodutorMusical
        private String musicaAtual;
        public String selecionarMusica(String musica) {
            musicaAtual = musica;
            return "Música " + musica + " selecionada.";
        }
        public String tocar() {
            return ("Reproduzindo "+musicaAtual);
        }
        public String pausar() {
            return ("Interropendo a reprodução de "+musicaAtual);
        }
        // Implementação dos métodos de IAparelhoTelefonico
        private String numeroLigacao;
        public String ligar(String numero) {
            numeroLigacao = numero;
            return "Ligando para "+numero+"...";
        }
        public String atender() {
            return "O número "+numeroLigacao+" atendeu.";
        }
        public String iniciarCorreioVoz() {
            return "Iniciando correio de voz para o numero: "+numeroLigacao;
        }
        // Implementação dos métodos de INavegadorInternet
        public String exibirPagina(String url) {
            return "Exibindo página: " + url;
        }
        public String adicionarNovaAba() {
            return "Nova aba adicionada.";
        }
        public String atualizarPagina() {
            return "Página atualizada.";
        }
    }
    
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    // Instanciando o Iphone
	    Iphone meuCelular = new Iphone();
        // Iniciando apresentação
		System.out.println("Vamos apresentar meu celular (quase) novo!");
		System.out.println("Primeiro os recursos de Reprodução Musical!");
		System.out.println("Digita o nome da musica para tocar:");
		System.out.println(meuCelular.selecionarMusica(scanner.nextLine()));
		System.out.println("Para iniciar a musica aperte alguma tecla!");
		scanner.nextLine();
		System.out.println(meuCelular.tocar());
		System.out.println("Para pausar a musica aperte alguma tecla!");
		scanner.nextLine();
		System.out.println(meuCelular.pausar());
		System.out.println("Agora vamos testar os recursos de Telefonema!");
		System.out.println("Digite o numero para ligar:");
		System.out.println(meuCelular.ligar(scanner.nextLine()));
		System.out.println("Para seguir aperte alguma tecla...");
		scanner.nextLine();
		System.out.println(meuCelular.atender());
		System.out.println("Para finalizar a ligação e deixar um correio de voz aperte alguma tecla!");
		scanner.nextLine();
		System.out.println(meuCelular.iniciarCorreioVoz());
		System.out.println("Para finalizar aperte alguma tecla..");
		scanner.nextLine();
		System.out.println("Agora vamos testar os recursos de Navegação na Internet!");
		System.out.println("Digite a url do site desejado:");
		System.out.println(meuCelular.exibirPagina(scanner.nextLine()));
		System.out.println("Para abrir uma nova aba aperte alguma tecla...");
		scanner.nextLine();
		System.out.println(meuCelular.adicionarNovaAba());
		System.out.println("Para atualizar a pagina parte alguma tecla..");
		scanner.nextLine();
		System.out.println(meuCelular.atualizarPagina());
		System.out.println("A apresentação terminou, aperte alguma tecla para fechar o programa!");
		scanner.nextLine();
		scanner.close();
	}
}