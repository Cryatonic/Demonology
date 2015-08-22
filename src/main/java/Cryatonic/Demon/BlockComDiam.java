package Cryatonic.Demon;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockComDiam extends Block {

	protected BlockComDiam(Material material) {
		super(material);
		this.setBlockName("ComDiam");
		this.setBlockTextureName("demon:ComDiam");
		this.setResistance(30.0F);
		this.setHardness(3.0F);
		this.setHarvestLevel();
	}

	private void setHarvestLevel() {
		
	}

}
