import org.junit.jupiter.api.Test;
import organ.FaceOrgan;
import titans.ArmoredTitan;

import static org.junit.jupiter.api.Assertions.*;


public class TitanTests {
    ArmoredTitan Titan = ArmoredTitan.create();


    @Test
    public void FaceOrganHP_Test(){assertEquals(30,Titan.getFaceOrgan().getHp());}
    @Test
    public void ChestOrganHP_Test(){assertEquals(210,Titan.getChestOrgan().getHp());}
    @Test
    public void NeckOrganHP_Test(){assertEquals(45,Titan.getNeckOrgan().getHp());}
    @Test
    public void ArmOrganHP_Test(){assertEquals(80,Titan.getLeftArmOrgan().getHp());}
    @Test
    public void LegOrganHP_Test(){assertEquals(55,Titan.getLeftLegArmor().getHp());}
    @Test
    public void StomachOrganHP_Test(){assertEquals(50,Titan.getStomachOrgan().getHp());}
    @Test
    public void FootOrganHP_Test(){assertEquals(45,Titan.getRightFootOrgan().getHp());}

    @Test
    public void Damage_Test(){
        Titan.getFaceOrgan().takeDamage(20);
        assertEquals(16,Titan.getFaceOrgan().getHp());
        Titan.getChestOrgan().takeDamage(40);
        assertEquals(193,Titan.getChestOrgan().getHp());
        Titan.getNeckOrgan().takeDamage(10);
        assertEquals(37.5,Titan.getNeckOrgan().getHp());
        Titan.getLeftArmOrgan().takeDamage(30);
        assertEquals(61.25,Titan.getLeftArmOrgan().getHp());
        Titan.getLeftLegArmor().takeDamage(35);
        assertEquals(39.25,Titan.getLeftLegArmor().getHp());
        Titan.getRightFootOrgan().takeDamage(20);
        assertEquals(32.63,Titan.getRightFootOrgan().getHp());
        Titan.getStomachOrgan().takeDamage(100);
        assertEquals(0,Titan.getStomachOrgan().getHp());
    }

    @Test
    public void TakeDamage_Test(){
        assertTrue(Titan.getFaceOrgan().takeDamage(100));
        assertFalse(Titan.getNeckOrgan().takeDamage(10));
        assertFalse(Titan.getChestOrgan().takeDamage(50));
        assertTrue(Titan.getLeftArmOrgan().takeDamage(200));
        assertFalse(Titan.getRightLegArmor().takeDamage(60));
        assertTrue(Titan.getRightFootOrgan().takeDamage(500));
        assertFalse(Titan.getStomachOrgan().takeDamage(45));
    }

}
