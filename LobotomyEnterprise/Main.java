import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
//SETORES

        // --- 1. SETOR DE DESENVOLVIMENTO DE JOGOS ---
        
        // Projeto de Treino de Ia para jovens desenvolvedores
        Proj TreinoDeIa = new Proj("Curso de Treinamento de IA para jogos",
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
                
                

    }
}
