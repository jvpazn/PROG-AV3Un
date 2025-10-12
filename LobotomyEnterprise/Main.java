//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;

public class Main {
    public static void main(String[] args) {
        
//PATROCINADORES

        Patrocinador patronSinner1 = new Patrocinador("Yi Sang", "VOEMINHASASAS1DEAIS", "1994-01-01", "11122233344", "LIMBUSCOMPANY1@gmail.city.com", 8000, 10);

        Patrocinador patronSinner2 = new Patrocinador("Faust", "EuSE1d3Tud0", "1990-07-25", "22233344455", "LIMBUSCOMPANY2@gmail.city.com", 12000, 25);

        Patrocinador patronSinner3= new Patrocinador("Don Quixote","GRANDEHEROINA101","1981-05-28","77744422211","LIMBUSCOMPANY3@gmail.city.com",5000,30); 

        Patrocinador patronSinner4 = new Patrocinador("Ryoshu", "C1g4rrosC4444ros", "1988-11-12", "44455566677", "LIMBUSCOMPANY4@gmail.city.com", 9500, 15);

        Patrocinador patronSinner5 = new Patrocinador("Meursault", "meursault", "1985-04-03", "55566677788", "LIMBUSCOMPANY5@gmail.city.com", 7000, 40);

        Patrocinador patronSinner6 = new Patrocinador("Hong Lu", "vov0te0deio", "2001-09-21", "66677788899", "LIMBUSCOMPANY6@gmail.city.com", 15000, 5);

        Patrocinador patronSinner7 = new Patrocinador("Heathcliff", "VINGANC4", "1995-02-14", "77788899900", "LIMBUSCOMPANY7@gmail.city.com", 6000, 20);

        Patrocinador patronSinner8 = new Patrocinador("Ishmael", "MALDITA4H4BIREITE3NCONTRAR", "1996-10-06", "88899900011", "LIMBUSCOMPANY8@gmail.city.com", 11000, 35);

        Patrocinador patronSinner9 = new Patrocinador("Rodion", "AmaisL1ndad3tds", "1987-03-29", "99900011122", "LIMBUSCOMPANY9@gmail.city.com", 8500, 30);

        Patrocinador patronSinner11 = new Patrocinador("Sinclair", "EUSOUF0RTECONFIEM3MMIM", "2003-08-17", "00011122233", "LIMBUSCOMPANY11@gmail.city.com", 7500, 18);

        Patrocinador patronSinner12 = new Patrocinador("Outis", "DANTETEAMO100000PORCENTO", "1975-12-05", "11100099988", "LIMBUSCOMPANY12@gmail.city.com", 10000, 22);

        Patrocinador patronSinner13 = new Patrocinador("Gregor", "BARATASMEASSUST4M", "1991-06-30", "22211100099", "LIMBUSCOMPANY13@gmail.city.com", 5500, 45);

//AVALIAÇÕES

        // Em quesitos de avaliação, utiliza de S a F       
        Avaliacao AvalTreinoDeIa = new Avaliacao("S","AA","B");

        Avaliacao AvalprojetoMotorIlusao = new Avaliacao("A","C","C");

        Avaliacao AvalprojetoTesteBeta = new Avaliacao("SS+","B","F");

        Avaliacao AvalprojetoIntegracaoIdentidades = new Avaliacao("S","AA","B");

        Avaliacao AvalOtimizacaoOuro = new Avaliacao("SS","SS","SSS+");

        Avaliacao AvalprojetoAuditoriaWCorp = new Avaliacao("A","S","C");
        
//PROJETOS

        // --- 1. SETOR DE DESENVOLVIMENTO DE JOGOS ---

        // Projeto de Treino de Ia para jovens desenvolvedores
        Proj TreinoDeIa = new Proj(
        "Curso de Treinamento de IA para jogos",
        "Este curso intensivo mergulha no coração da Inteligência Artificial (IA) aplicada ao desenvolvimento de jogos, ensinando você a criar inimigos, personagens não-jogáveis (NPCs) e mundos virtuais que pensam, reagem e aprendem.",
        "2026-12-31",
        Arrays.asList(patronSinner1, patronSinner9),
        AvalTreinoDeIa);

        // Motor de Ilusões de Fundo
        Proj projetoMotorIlusao = new Proj(
        "Motor de Ilusões de Fundo", 
        "Desenvolvimento de um sistema de renderização procedural para gerar Ruínas de fundo dinâmicas em alta resolução, otimizando o carregamento e a experiência imersiva.",
        "2027-01-31",
        Arrays.asList(patronSinner11,patronSinner4),
        AvalprojetoMotorIlusao);

        // --- 2. SETOR DE RELAÇÕES DE PESSOAS ---

        // Projeto de Betas
        Proj projetoTesteBeta = new Proj(
            "Projeto de Teste Beta para produtos e sistemas futuros", 
            "Um projeto que trás voluntarios para testar novos produtos como 'TODOS DEVEM SER FELIZES :)' e 'NOS PODEMOS MUDAR QUALQUER COISA' onde os testes são de graça e pessoas podem até ser pagas por isso.",
            "2026-01-31",
            Arrays.asList(patronSinner2,patronSinner7),
            AvalprojetoTesteBeta);

        // Programa de Integração de Identidades
        Proj projetoIntegracaoIdentidades = new Proj(
            "Programa de Integração de Identidades", 
            "Criação de um programa de pesquisa para observas como as pessoas e trabalhadores da empresa se identificam com os nossos jogos e produtos.",
            "2025-11-01",
            Arrays.asList(patronSinner5,patronSinner6),
            AvalprojetoIntegracaoIdentidades);

        // --- 3. SETOR DE FINANÇAS ---

        // Otimização de Liquidez de Ouro
        Proj projetoOtimizacaoOuro = new Proj(
            "Otimização de Liquidez de Ouro", 
            "Curso de Análise e criação de um algoritmo financeiro para gerenciar a volatilidade da moeda 'Gold' na Cidade e otimizar o seu bolso.",
            "2025-11-01",
            Arrays.asList(patronSinner3,patronSinner13),
            AvalOtimizacaoOuro);

        // Auditoria de Recebíveis da Warp Corp
        Proj projetoAuditoriaWCorp = new Proj(
            "Auditoria de Recebíveis da Warp Corp", 
            "Projeto focado em auditar e reconciliar as faturas de transporte de L.E.D. da W Corp, garantindo que os pagamentos estejam corretos e dentro do prazo contratual.",
            "2025-12-01",
            Arrays.asList(patronSinner12,patronSinner8),
            AvalprojetoAuditoriaWCorp);
                

            //CARGOS

        Cargo gerente = new Cargo(
            "Gerente",
            "Gerencia os funcionários no setor onde está", 
            23000, 
            "Saúde mental forte, ensino superior completo");
    
        Cargo pleno = new Cargo(
            "Pleno",
            "Trabalhador de cargo médio, segue as ordens dos superiores", 
            4000, 
            "Ensino fundamental completo e experiência média no mercado de trabalho");

        Cargo junior = new Cargo(
            "Trabalhador Junior",
            "Trabalhador Iniciante e novo as tradições da empresa, não confundir com estagiário", 
            2000, 
            "Ensino fundamental completo");

        Cargo senior = new Cargo(
            "Trabalhador Sênior",
            "Trabalhador experiente e preparado para as tradições da empresa", 
            6100, 
            "Ensino Superior completo e uma boa experiência como funcionário na empresa");
    
//FUNCIONÁRIOS

        Funcionario BongBong = new Funcionario(
            "BongBong Library of ruina", 
            "Bong123bomg", 
            "15-04-1993", 
            "536574234-64", 
            "bonghehe123@gmail.com", 
            "bbg@funcionario.lobEnterprise.com", 
            "Ensino Superior Completo", 
            60, 
            7000, 
            "Newlobloblob20XX-524", 
            null, 
            senior);

        Funcionario Viktor = new Funcionario(
            "Viktor henrique da silva", 
            "7123e1h893UHQaS&*", 
            "05-10-2000", 
            "847632823-12", 
            "vikorhsilva@gmail.com", 
            "vhs@funcionario.lobEnterprise.com", 
            "Ensino Medio Completo", 
            45, 
            2500, 
            "Newlobloblob20XX-192", 
            null, 
            junior);

        Funcionario Mantleholder = new Funcionario(
            "John T. Mantleholder", 
            "ERAMJohn", 
            "05-10-1974", 
            "938747182-43", 
            "eramjohnmantle@gmail.com", 
            "jtm@funcionario.lobEnterprise.com", 
            "Doutorado", 
            70, 
            23000, 
            "Newlobloblob20XX-854", 
            null, 
            gerente);

        Funcionario Theo = new Funcionario(
            "Theo Ferreira derfreischutz ", 
            "1234", 
            "15-04-1995", 
            "194726483-53", 
            "theofschultz@gmail.com", 
            "tfs@funcionario.lobEnterprise.com", 
            "Ensino Medio Completo", 
            35, 
            2000, 
            "Newlobloblob20XX-462", 
            null, 
            junior);

        Funcionario Renan = new Funcionario(
            "Renan Aprigio dias de Moura", 
            "CARROSLEGAIS123", 
            "31-05-2008", 
            "857439285-54", 
            "RenanDias3158@gmail.com", 
            "radm@funcionario.lobEnterprise.com", 
            "Doutorado", 
            70, 
            25000, 
            "Newlobloblob20XX-341", 
            null, 
            gerente);

        Funcionario Roland = new Funcionario(
            "Roland Orlandofurioso Nascimento", 
            "1m1ssmyw1f3_123", 
            "23-11-1993", 
            "954837214-52", 
            "orlandofuriosoAngelica@gmail.com", 
            "ron@funcionario.lobEnterprise.com", 
            "Pos-Doutorado", 
            120, 
            30000, 
            "Newlobloblob20XX-182", 
            null, 
            gerente);

        Funcionario Jailma = new Funcionario(
            "Jailma Oliveira", 
            "CIENCIASS0CIAIS", 
            "17-08-1975", 
            "943179329-55", 
            "JailmaOliveira12345@gmail.com", 
            "jo@funcionario.lobEnterprise.com", 
            "Mestrado", 
            60, 
            5600, 
            "Newlobloblob20XX-283", 
            null, 
            pleno);

        Funcionario Joao = new Funcionario(
            "Joao Victor da Paz Nascimento", 
            "joaoGatinhosF0F1nhos", 
            "28-05-2009", 
            "582917283-91", 
            "joaovitor223344joao@gmail.com", 
            "jvpn@funcionario.lobEnterprise.com", 
            "Doutorado", 
            80, 
            6210, 
            "Newlobloblob20XX-845", 
            null, 
            senior);

        Funcionario Tenna = new Funcionario(
            "Tenna Tenório de Caldas", 
            "kingofROLYPOLYspamton", 
            "19-12-1996", 
            "942719472-94", 
            "itstvtiiiime@gmail.com", 
            "ttc@funcionario.lobEnterprise.com", 
            "Mestrado", 
            45, 
            3100, 
            "Newlobloblob20XX-645", 
            null, 
            junior);

        Funcionario Benicio = new Funcionario(
            "Benício Bastos de Castro", 
            "benbascas123#321", 
            "22-09-1988", 
            "948273048-86", 
            "ben123pro@gmail.com", 
            "bbc@funcionario.lobEnterprise.com", 
            "Ensino Superior Completo", 
            35, 
            2300, 
            "Newlobloblob20XX-048", 
            null, 
            junior);

        Funcionario Luana = new Funcionario(
            "Luana miranda da silva", 
            "Luanahenr123fdsa@", 
            "19-03-2001", 
            "473628374-32", 
            "luanaa4atchetche@gmail.com", 
            "lms@funcionario.lobEnterprise.com", 
            "Bacharelado", 
            45, 
            4534, 
            "Newlobloblob20XX-012", 
            null, 
            pleno);

        Funcionario Matheus = new Funcionario(
            "Matheus Luciano de Cabritos Figueiredo", 
            "KONOMATH3U5DA", 
            "29-09-2008", 
            "593274837-23", 
            "MatheusCabritinhos@gmail.com", 
            "mlcf@funcionario.lobEnterprise.com", 
            "Bacharelado", 
            45, 
            5900, 
            "Newlobloblob20XX-593", 
            null, 
            pleno);

//ESTAGIARIOS
        Estagiario Juan = new Estagiario(
            "Juan Vila Nova Rojas Moreno", 
            "RELAXAeAGACHA", 
            "01-10-2008", 
            "717888653-77", 
            "JuanVilaAGACHA@gmail.com", 
            "jvnrm@funcionario.lobEnterprise.com", 
            "Cursando Ensino médio", 
            20, 
            630, 
            "Newlobloblob20XX-597", 
            "31-12-2026",
            null, 
            Roland);

        Estagiario Tome = new Estagiario(
            "Artut Tome Xavier", 
            "NIKANIFATEART0RIA", 
            "23-10-2008", 
            "717621653-67", 
            "TomeNIkas@gmail.com", 
            "ATX@funcionario.lobEnterprise.com", 
            "Cursando Ensino médio", 
            20, 
            500, 
            "Newlobloblob20XX-514", 
            "31-12-2026",
            null, 
            Roland);

        Estagiario Demian = new Estagiario(
            "Demian Rodrigues de Marques", 
            "OPEQUENOpr1ncipe", 
            "06-08-2010", 
            "111111111-23", 
            "DemianMANG@gmail.com", 
            "drm@funcionario.lobEnterprise.com", 
            "Cursando Ensino médio", 
            25, 
            730, 
            "Newlobloblob20XX-505", 
            "31-12-2026",
            null, 
            Renan);

        Estagiario Rainha = new Estagiario(
            "RAINHA DO ODIO JABOATAO DOS GUARARAPES", 
            "ARCANASLAAAAAAAAAAAAAAAAAAAAAA4AAAAAAAAAAVE", 
            "09-12-2011", 
            "11122233-43", 
            "EMNOMEDOAMOREDOODIO@gmail.com", 
            "rdojdg@funcionario.lobEnterprise.com", 
            "Cursando Ensino médio", 
            30, 
            930, 
            "Newlobloblob20XX-629", 
            "31-12-2026",
            null, 
            Renan);

        Estagiario Alyson = new Estagiario(
            "Alyson Oliveira Quimica", 
            "JoaoQuimica", 
            "01-10-2007", 
            "999888653-99", 
            "AlysonQuimica@gmail.com", 
            "aoq@funcionario.lobEnterprise.com", 
            "Cursando Ensino médio", 
            10, 
            330, 
            "Newlobloblob20XX-888", 
            "31-12-2026",
            null, 
            Mantleholder);

        Estagiario Teto = new Estagiario(
            "Kasane Teto", 
            "MACHINEL0VE", 
            "01-04-2008", 
            "010101010-01", 
            "tetoris@gmail.com", 
            "ks@funcionario.lobEnterprise.com", 
            "Cursando Ensino médio", 
            30, 
            1600, 
            "Newlobloblob20XX-104", 
            "31-12-2026",
            null, 
            Mantleholder);
//SETORES
        Setor devJogos = new Setor(
            "SETOR DE DESENVOLVIMENTO DE JOGOS", 
            TreinoDeIa, 
            Arrays.asList(projetoMotorIlusao), 
            Arrays.asList(Roland,Joao, Luana, Viktor), 
            Arrays.asList(Juan,Tome), 
            "1");

        Roland.setSetor(devJogos);
        Joao.setSetor(devJogos);
        Luana.setSetor(devJogos);
        Viktor.setSetor(devJogos);
        Juan.setSetor(devJogos);
        Tome.setSetor(devJogos);

        Setor relPessoais = new Setor(
            "SETOR DE RELACOES PESSOAIS", 
            projetoTesteBeta, 
            Arrays.asList(projetoIntegracaoIdentidades), 
            Arrays.asList(Mantleholder,BongBong, Benicio, Tenna), 
            Arrays.asList(Alyson,Teto), 
            "2");

        Mantleholder.setSetor(relPessoais);
        BongBong.setSetor(relPessoais);
        Benicio.setSetor(relPessoais);
        Tenna.setSetor(relPessoais);
        Alyson.setSetor(relPessoais);
        Teto.setSetor(relPessoais);

        Setor Financas = new Setor(
            "SETOR DE FINANCAS", 
            projetoOtimizacaoOuro, 
            Arrays.asList(projetoAuditoriaWCorp), 
            Arrays.asList(Renan,Jailma, Matheus, Theo), 
            Arrays.asList(Demian,Rainha), 
            "3");

        Renan.setSetor(Financas);
        Jailma.setSetor(Financas);
        Matheus.setSetor(Financas);
        Theo.setSetor(Financas);
        Demian.setSetor(Financas);
        Rainha.setSetor(Financas);

        Empresa LobotomyEnterprise = new Empresa(
            Arrays.asList(devJogos,relPessoais,Financas)
        );

    System.out.println("LOBOTOMY ENTERPRISE : SETORES");

    for (Setor setor : LobotomyEnterprise.getSetores()) {
        System.out.println(setor.getNome());
    }
//PRINTS E ETC
    System.out.println("LOBOTOMY ENTERPRISE : TRABALHADORES E ESTAGIARIOS");
    for (Setor setor : LobotomyEnterprise.getSetores()) {
    System.out.println("\n== SETOR: " + setor.getNome() + " ==");
    
    System.out.println("  -- FUNCIONÁRIOS:");
    for (Funcionario f : setor.getFuncionarios()) {

        System.out.println("    - Nome: " + f.getNome() + " | Cargo: " + f.getCargo().getTitulo());
    }
    
    System.out.println("  -- ESTAGIÁRIOS:");
    for (Estagiario e : setor.getEstagiarios()) {
        System.out.println("    - Nome: " + e.getNome() + " | Supervisor: " + e.getSupervisor().getNome());
    }
}

    System.out.println("CONHEÇA NOSSOS GERENTES");
    System.out.println("\n");
    Renan.dadosPublicos();
    System.out.println("\n");
    Mantleholder.dadosPublicos();
    System.out.println("\n");
    Roland.dadosPublicos();


    }
    
}
