package pkTest;

import javax.swing.JOptionPane;
import pkClasses.*;

public class TestQuestionQuiz {

	public static void main(String[] args) {
		
		String reponsePossible = " ";
		Question question1, question2;
		
		// Cr�ation d'un objet du nom de question1.
		// La question 1 est= Combien y a-t-il de fleurs de lys sur le drapeau du Qu�bec ?
		// Le niveau de complexit� est de 2.
		question1 = new Question("Combien y a-t-il de fleurs de lys sur le drapeau du Qu�bec?", "4");
		question1.setComplexite(2);
		
		// Cr�ation d'un objet du nom de question2.
		// La question 2 est = Quelle est la capitale de la Jama�que ?
		// La bonne r�ponse est Kingston
		// Le niveau de complexit� est de 4.
		question2 = new Question("Quelle est la capitale de la Jama�que?", "Kingston");
		question2.setComplexite(4);
		
		
		// Concernant la question 1.
		// Afficher la question � l'utilisateur.
		JOptionPane.showMessageDialog(null, question1.getQuestion());
		
		// Afficher aussi le niveau de complexit� de la question.
		JOptionPane.showMessageDialog(null, "Cette question � un niveau de complexit� de " + question1.getComplexite());
		
		// Demander � l'utilisateur d'entrer une r�ponse ( message significatif )
		reponsePossible = JOptionPane.showInputDialog(null, "Veuillez entrer votre r�ponse", "Reponse en chiffre");
		
		// Si l'utilisateur a la bonne r�ponse, afficher un message significatif en ce sens
		// Si l'utilisateur n'a pas la bonne r�ponse
		// afficher un message significatif en ce sens
		// et lui afficher la bonne r�ponse.
		
		if(question1.verifierReponse(reponsePossible))
			JOptionPane.showMessageDialog(null, "Bonne r�ponse!!!");
		else
			JOptionPane.showMessageDialog(null, "Mauvaise r�ponse... La bonnne r�ponse est " + question1.getReponse());
		
		
		// Refaire les m�mes �tapes pour la question 2.
		JOptionPane.showMessageDialog(null, question2.getQuestion());
		JOptionPane.showMessageDialog(null, "Cette question � un niveau de complexit� de " + question2.getComplexite());
		reponsePossible = JOptionPane.showInputDialog(null, "Veuillez entrer votre r�ponse");
		
		if(question2.verifierReponse(reponsePossible))
			JOptionPane.showMessageDialog(null, "Bonne r�ponse!!!");
		else
			JOptionPane.showMessageDialog(null, "Mauvaise r�ponse... La bonnne r�ponse est " + question2.getReponse());
		
		System.exit(0);

	}

}


//Mettre en commentaires les r�sultats de ton quiz � la fin de celui-ci.
//Faire ex�cuter ton quiz devant l'enseignant. 
//Remettre le quiz sur le L�a de l'enseignant.

//Comme j'ai fait des JOptionPanes, je n'ai rien a copier/coller ici
