package com.github.mahmudindev.mcmod.superflatdimension;

import com.github.mahmudindev.mcmod.superflatdimension.platform.Services;
import com.github.mahmudindev.mcmod.superflatdimension.platform.services.IPlatformHelper;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public final class SuperflatDimension {
    public static final String MOD_ID = "superflatdimension";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final IPlatformHelper PLATFORM = Services.PLATFORM;

    public static void init() {
        // Write common init code here.
    }
}
