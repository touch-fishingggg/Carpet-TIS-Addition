package carpettisaddition.mixins.rule.WanderingTraderSpawnTimer;

import carpettisaddition.CarpetTISAdditionSettings;
import net.minecraft.world.WanderingTraderManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(WanderingTraderManager.class)
public class WanderingTraderManagerMixin {
    @ModifyConstant(
            method = "spawn",
            constant = @Constant(intValue = 24000),
            require = 1
    )
    private int getSpawnDelay1(int timer) {
        return CarpetTISAdditionSettings.WanderingTraderSpawnTimer;
    }

    @ModifyConstant(
            method = "spawn",
            constant = @Constant(intValue = 1200),
            require = 2
    )
    private int getspawnTimer1(int timer) {
        return CarpetTISAdditionSettings.WanderingTraderSpawnTimer==24000?1200:1;
    }

    @ModifyConstant(
            method = "Lnet/minecraft/world/WanderingTraderManager;<init>(Lnet/minecraft/world/level/ServerWorldProperties;)V",
            constant = @Constant(intValue = 24000),
            require = 1
    )
    private int getSpawnDelay2(int timer) {
        return CarpetTISAdditionSettings.WanderingTraderSpawnTimer;
    }

    @ModifyConstant(
            method = "Lnet/minecraft/world/WanderingTraderManager;<init>(Lnet/minecraft/world/level/ServerWorldProperties;)V",
            constant = @Constant(intValue = 1200),
            require = 1
    )
    private int getspawnTimer2(int timer) {
        return CarpetTISAdditionSettings.WanderingTraderSpawnTimer==24000?1200:1;
    }
}

