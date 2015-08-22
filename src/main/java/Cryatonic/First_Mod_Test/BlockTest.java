package Cryatonic.First_Mod_Test;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTest extends Block {

	protected BlockTest(Material material) {
		super(material);
		this.setBlockName("BlockTest");
		this.setBlockTextureName("fmt:blocktest");
	}

}
