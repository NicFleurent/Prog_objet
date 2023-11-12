package pkTest;

import javax.swing.JOptionPane;
import pkClasses.*;

public class TestQuestionQuiz {

	public static void main(String[] args) {
		
		String reponsePossible = " ";
		Question question1, question2;
		
		// Création d'un objet du nom de question1.
		// La question 1 est= Combien y a-t-il de fleurs de lys sur le drapeau du Québec ?
		// Le niveau de complexité est de 2.
		question1 = new Question("Combien y a-t-il de fleurs de lys sur le drapeau du Québec?", "4");
		question1.setComplexite(2);
		
		// Création d'un objet du nom de question2.
		// La question 2 est = Quelle est la capitale de la Jamaïque ?
		// La bonne réponse est Kingston
		// Le niveau de complexité est de 4.
		question2 = new Question("Quelle est la capitale de la Jamaïque?", "Kingston");
		question2.setComplexite(4);
		
		
		// Concernant la question 1.
		// Afficher la question à l'utilisateur.
		JOptionPane.showMessageDialog(null, question1.getQuestion());
		
		// Afficher aussi le niveau de complexité de la question.
		JOptionPane.showMessageDialog(null, "Cette question à un niveau de complexité de " + question1.getComplexite());
		
		// Demander à l'utilisateur d'entrer une réponse ( message significatif )
		reponsePossible = JOptionPane.showInputDialog(null, "Veuillez entrer votre réponse", "Reponse en chiffre");
		
		// Si l'utilisateur a la bonne réponse, afficher un message significatif en ce sens
		// Si l'utilisateur n'a pas la bonne réponse
		// afficher un message significatif en ce sens
		// et lui afficher la bonne réponse.
		
		if(question1.verifierReponse(reponsePossible))
			JOptionPane.showMessageDialog(null, "Bonne réponse!!!");
		else
			JOptionPane.showMessageDialog(null, "Mauvaise réponse... La bonnne réponse est " + question1.getReponse());
		
		
		// Refaire les mêmes étapes pour la question 2.
		JOptionPane.showMessageDialog(null, question2.getQuestion());
		JOptionPane.showMessageDialog(null, "Cette question à un niveau de complexité de " + question2.getComplexite());
		reponsePossible = JOptionPane.showInputDialog(null, "Veuillez entrer votre réponse");
		
		if(question2.verifierReponse(reponsePossible))
			JOptionPane.showMessageDialog(null, "Bonne réponse!!!");
		else
			JOptionPane.showMessageDialog(null, "Mauvaise réponse... La bonnne réponse est " + question2.getReponse());
		
		System.exit(0);

	}

}


//Mettre en commentaires les résultats de ton quiz à la fin de celui-ci.
//Faire exécuter ton quiz devant l'enseignant. 
//Remettre le quiz sur le Léa de l'enseignant.

//Comme j'ai fait des JOptionPanes, je n'ai rien a copier/coller ici
