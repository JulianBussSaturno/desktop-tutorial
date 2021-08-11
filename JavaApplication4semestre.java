package javaapplication4semestre;

import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class JavaApplication4semestre {

    public static void main(String[] args) {

        String nome;
        Double qntalunos, qntnotas, notas, soma,mdturma, md = 0.0, somatudo = 0.0, mdapv = 0.0;

        qntalunos = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de alunos de uma sala de aula "));

        for (int i = 0; i < qntalunos; i++) {
            soma = 0.0;

            nome = JOptionPane.showInputDialog(null, "Digite o nome");

            qntnotas = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de notas do aluno(a) "));

            for (int a = 0; a < qntnotas; a++) {

                notas = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota "));
                mdapv++;
                soma += notas;
                somatudo += notas;

                md = (soma / qntnotas);

            }

            if (md >= 7) {

                JOptionPane.showMessageDialog(null, "O aluno(a) " + nome + " foi aprovado e a média das notas foi de " + md);

            } else if (md < 6) {

                JOptionPane.showMessageDialog(null, "O " + nome + " está em exame e a média das notas foi de " + md);

            }
        }
        mdturma = (somatudo / mdapv );
        JOptionPane.showMessageDialog(null, " A média da turma foi de " + mdturma);
    }
}
