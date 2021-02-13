package wz.oregen;

import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.connect.IMixinConnector;

public class WzModMixinConnector implements IMixinConnector{

	@Override
	public void connect() {
		MixinBootstrap.init();
		Mixins.addConfiguration("mixins.wzoregen.json");
	}

}