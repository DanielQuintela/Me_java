package TrabalhoUnit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    static ArrayList<Dentista> listaDentista = new ArrayList<Dentista>();
    static ArrayList<Paciente> listaPaciente = new ArrayList<Paciente>();
    static ArrayList<Consulta> listaConsulta = new ArrayList<Consulta>();

    public static void main(String[] args) throws ParseException {
        String opcao = "";
        while (!opcao.equals("N")) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("1. Cadastro de Dentistas \n"
                    + "2. Cadastro de Pacientes \n"
                    + "3. Cadastro de Consultas \n" +
                    "4. Cancelamento de Consultas \n"
                    + "5. Relatório de Consultas Agendadas \n" +
                    "6. Relatório Financeiro");
            opcao = entrada.next();
            if (opcao.equals("1")) {
                cadastrarDentista();
            } else {
                if (opcao.equals("2")) {
                    cadastrarPaciente();
                } else {
                    if (opcao.equals("3")) {
                        cadastroConsulta();
                    } else {
                        if (opcao.equals("4")) {
                            ;
                        } else {
                            if (opcao.equals("5")) {
                                ;
                            } else {
                                if (opcao.equals("6")) {
                                    ;
                                } else {
                                    if (opcao.equals("N")) {
                                        break;
                                    } else {
                                        System.out.println("Opção inválida!");
                                    }
                                }
                            }
                        }
                    }
                }
                System.out.println("Deseja continuar? [S/N]");
                opcao = entrada.next();
            }

        }

    }

    public static void cadastrarDentista() throws ParseException {
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Dentista dDentista= new Dentista();
        System.out.println("CRO : ");
        dDentista.setCro(entrada.next());
        System.out.println("Qual seu nome ?: ");
        dDentista.setNome(entrada.next());
        System.out.println("Qual a data do seu aniversário ?: ");
        dDentista.setDtnascimento(formato.parse(entrada.next()));
        System.out.println("Qual a data do cadastro ?: ");
        dDentista.setDtcadastro(formato.parse(entrada.next()));
        listaDentista.add(dDentista);

    }



    public static void cadastrarPaciente() throws ParseException {
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Paciente pPaciente = new Paciente();
        System.out.println("Bem vindo ao cadastro de Cliente! ");
        System.out.println("Qual seu cpf ?: ");
        pPaciente.setCpf(entrada.next());
        System.out.println("Qual seu nome ?: ");
        pPaciente.setNome(entrada.next());
        System.out.println("Qual sua data de aniversário?: ");
        pPaciente.setDtnascimento(formato.parse(entrada.next()));
        System.out.println("Qual a data do cadastro ?: ");
        pPaciente.setDtcadastro(formato.parse(entrada.next()));
        System.out.println("Qual seu endereço");
        pPaciente.setEndereco(entrada.next());
        listaPaciente.add(pPaciente);

    }
    /*
    Dentista
    Paciente
    Data da consulta
    Hora da consulta
    Flag de Primeira Consulta
    Status da consulta (Agendada, cancelada)
    Valor da consulta
*/

    public static void cadastroConsulta() throws ParseException {
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String status = "Agendada";

        Consulta cConsulta = new Consulta();
        System.out.println("Seja muito bem vindo!! \n" +
                "Para começar, Qual seu Dentista ?: ");
        for (Dentista dentista : listaDentista) {
            System.out.println("->"+ dentista.getNome() + ",");
        }
        cConsulta.setNome(entrada.next());
        System.out.println("Identificação do paciente pelo nome completo \n Abaixo escreva seu nome" +
                "completo de acordo com o nome na lista");
        for (Paciente paciente : listaPaciente){
            System.out.println("->" + paciente.getNome() + ",");
        }
        cConsulta.setNomeliente(entrada.next());
        System.out.println("Qual vai ser a data da consulta? ");
        cConsulta.setDtconsulta(formato.parse(entrada.next()));
        System.out.println("Qual a hora ?");
        cConsulta.setHoraconsulta(entrada.next());

        cConsulta.setStatuscons(status);
        listaConsulta.add(cConsulta);
        for (Consulta consulta: listaConsulta){
            System.out.println(consulta.getStatuscons());

        }
        

    }
}
