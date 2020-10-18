import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ClasseTest{

	
	@Test
	public void comparaAlgo(){
		String messageEsperada = "uma mensagem";
		String messageAtual = "outra mensagem";
		Assert.assertEquals("O esperado não é igual o atual",messageEsperada,messageAtual);
	}
		
	@Test
	public void falhaAlgo(){
		fail("falhou");
	}
	
	@Test
	public void testaVerdadeiroAlgo(){
		boolean condicao = true;
		assertTrue("Era esperado verdadeiro", condicao);
	}
	
	@Test
	public void testaFalsoAlgo(){
		boolean condicao = false;
		assertFalse("Era esperado falso", condicao);
	}
	
	@Test
	public void testaIgualAlgo(){
		int esperado = 2;
		int atual = 1;
		assertEquals(esperado,atual,"O esperado deveria ser igual ao atual");
	}
	
	@Test
	public void testaNulo(){
		Object esperado = "não nulo";
		
		assertNull("Esperado nulo", esperado);
	}
	
	@Test
	public void testaNaoNulo(){
		Object esperado = null;
		assertNotNull("Esperado nulo", esperado);
	}
	
	@Test
	public void testaObjetoIgual(){
		String esperado = new String("a");
		String atual = new String("a");
		
		assertSame("Não é o mesmo objeto", esperado, atual);
	}
	
	@Test
	public void testaObjetoNaoIgual(){
		String esperado = new String("a");
		String atual = new String("a");
		
		assertNotSame("Não é o mesmo objeto", esperado, atual);
	}
}
