package com.github.mahmudindev.mcmod.superflatdimension.forge;

import com.github.mahmudindev.mcmod.superflatdimension.SuperflatDimension;
import net.minecraftforge.fml.common.Mod;

@Mod(SuperflatDimension.MOD_ID)
public final class SuperflatDimensionForge {
    public SuperflatDimensionForge() {
        // Run our common setup.
        SuperflatDimension.init();
    }
}
