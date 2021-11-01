package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AVLTreeMapTest {

	@Test
	void test() {
		AVLTreeMap<Integer, Integer> avl = new AVLTreeMap<Integer, Integer>();
		avl.put(44, 44);
		avl.put(17, 17);
		avl.put(78, 78);
		avl.put(32, 32);
		avl.put(50, 50);
		avl.put(88, 88);
		avl.put(48, 48);
		avl.put(62, 62);
		System.out.println("Uso da impressão parentizada de uma árvore AVL para visualizar \n"
		+ "que ela fica balanceada após as inserções e remoções\n");
		System.out.println("========================================");
		System.out.println("Antes da inserção de 54\n" + avl.printExpression(avl.root()));
		avl.put(54, 54);
		assertEquals("[17, 32, 44, 48, 50, 54, 62, 78, 88]", avl.keySet().toString());
		System.out.println("Após a inserção de 54\n" + avl.printExpression(avl.root()));
		System.out.println("========================================");
		System.out.println("Antes da remoção de 32\n" + avl.printExpression(avl.root()));
		avl.remove(32);
		assertEquals("[17, 44, 48, 50, 54, 62, 78, 88]", avl.keySet().toString());
		System.out.println("Após a remoção de 32\n" + avl.printExpression(avl.root()));
	}

}
