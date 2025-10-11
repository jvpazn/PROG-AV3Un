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

//CARGOS

        Cargo gerente = new Cargo(
            "Gerente",
            "Gerencia os funcionários no setor onde está", 
            23000, 
            "Saúde mental forte, ensino superior completo");
    
        Cargo medio = new Cargo(
            "Médio",
            "Trabalhador de cargo médio, segue as ordens dos superiores", 
            1600, 
            "Ensino fundamental completo e experiência média no mercado de trabalho");

        Cargo junior = new Cargo(
            "Trabalhador Junior",
            "Trabalhador Iniciante e novo as tradições da empresa, não confundir com estagiário", 
            1100, 
            "Ensino fundamental completo");

        Cargo senior = new Cargo(
            "Trabalhador Sênior",
            "Trabalhador experiente e preparado para as tradições da empresa", 
            3100, 
            "Ensino fundamental completo e uma boa experiência como funcionário na empresa");
    
//FUNCIONÁRIOS

        Funcionario BongBong = new Funcionario(
            "BongBong Chi III", 
            "Bong123bomg", 
            "15-04-1993", 
            "536574234-64", 
            "bonghehe123@gmail.com", 
            "bci@funcionario.lobEnterprise.com", 
            "II", 
            60, 
            3000, 
            "2024lobloblob-524", 
            null, 
            medio);

        Funcionario Viktor = new Funcionario(
            "Viktor henrique da silva", 
            "7123e1h893UHQaS&*", 
            "05-10-2000", 
            "847632823-12", 
            "vikorhsilva@gmail.com", 
            "vhs@funcionario.lobEnterprise.com", 
            "I", 
            45, 
            1600, 
            "2024lobloblob-192", 
            null, 
            junior);

        Funcionario Mantleholder = new Funcionario(
            "John T. Mantleholder", 
            "ERAM", 
            "05-10-1974", 
            "938747182-43", 
            "eramjohnmantle@gmail.com", 
            "jtm@funcionario.lobEnterprise.com", 
            "V", 
            70, 
            23000, 
            "2024lobloblob-854", 
            null, 
            gerente);

        Funcionario Theo = new Funcionario(
            "Theo Ferreira Schultz", 
            "1234", 
            "15-04-1995", 
            "194726483-53", 
            "theofschultz@gmail.com", 
            "tfs@funcionario.lobEnterprise.com", 
            "I", 
            35, 
            1300, 
            "2024lobloblob-462", 
            null, 
            junior);

        Funcionario Roberto = new Funcionario(
            "Roberto Júnior Oliveira", 
            "Roberto", 
            "27-02-1979", 
            "857439285-54", 
            "roberto@gmail.com", 
            "rjo@funcionario.lobEnterprise.com", 
            "V", 
            70, 
            21000, 
            "2024lobloblob-341", 
            null, 
            gerente);

        Funcionario Roland = new Funcionario(
            "Roland Orlandofurioso Nascimento", 
            "1m1ssmyw1f3_123", 
            "23-11-2005", 
            "954837214-52", 
            "orlandofurioso@gmail.com", 
            "ron@funcionario.lobEnterprise.com", 
            "V", 
            75, 
            30000, 
            "2024lobloblob-182", 
            null, 
            gerente);

        Funcionario Jobesvalda = new Funcionario(
            "Jobesvalda Maria de Souza", 
            "r234127ry3f3", 
            "17-08-1980", 
            "943179329-55", 
            "jobesvald234@gmail.com", 
            "jms@funcionario.lobEnterprise.com", 
            "III", 
            45, 
            2100, 
            "2024lobloblob-283", 
            null, 
            medio);

        Funcionario Clara = new Funcionario(
            "Clara Albuquerque Siqueira", 
            "clarac234932h23h", 
            "21-01-2000", 
            "582917283-91", 
            "claraas@gmail.com", 
            "cas@funcionario.lobEnterprise.com", 
            "IV", 
            50, 
            3200, 
            "2024lobloblob-845", 
            null, 
            senior);

        Funcionario Tenna = new Funcionario(
            "Tenna Tenório de Caldas", 
            "kingofROLYPOLYspamton", 
            "19-12-1996", 
            "942719472-94", 
            "itstvtiiiime@gmail.com", 
            "ttc@funcionario.lobEnterprise.com", 
            "III", 
            45, 
            2200, 
            "2024lobloblob-645", 
            null, 
            medio);

        Funcionario Benicio = new Funcionario(
            "Benício Bastos de Castro", 
            "benbascas123#321", 
            "22-09-1988", 
            "948273048-86", 
            "ben123pro@gmail.com", 
            "bbc@funcionario.lobEnterprise.com", 
            "IV", 
            35, 
            1400, 
            "2024lobloblob-048", 
            null, 
            junior);

        Funcionario Luana = new Funcionario(
            "Luana miranda da silva", 
            "Luanahenr123fdsa@", 
            "19-03-2001", 
            "473628374-32", 
            "luanaa4atchetche@gmail.com", 
            "lms@funcionario.lobEnterprise.com", 
            "III", 
            45, 
            1600, 
            "2024lobloblob-012", 
            null, 
            medio);

        Funcionario Davi = new Funcionario(
            "Davi Cabrito de Moura", 
            "7)&$@$#&*@$", 
            "14-07-1999", 
            "593274837-23", 
            "davihot@gmail.com", 
            "dcm@funcionario.lobEnterprise.com", 
            "III", 
            45, 
            2000, 
            "2024lobloblob-593", 
            null, 
            medio);

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
        Setor devJogos = new Setor(
            "SETOR DE DESENVOLVIMENTO DE JOGOS", 
            null, 
            null, 
            Arrays.asList(BongBong), 
            null, 
            "1");
        BongBong.setSetor(devJogos);
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
                
System.out.println(BongBong.getSetor().getNome());



    }
    
}

