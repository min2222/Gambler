package com.min01.gambler.entity.model;

import com.min01.gambler.Gambler;

import io.redspace.ironsspellbooks.entity.mobs.abstract_spell_casting_mob.AbstractSpellCastingMob;
import io.redspace.ironsspellbooks.entity.mobs.abstract_spell_casting_mob.AbstractSpellCastingMobModel;
import net.minecraft.resources.ResourceLocation;

public class GamblerModel extends AbstractSpellCastingMobModel
{
    public static final ResourceLocation MODEL = new ResourceLocation(Gambler.MODID, "geo/gambler.geo.json");
    public static final ResourceLocation TEXTURE = new ResourceLocation(Gambler.MODID, "textures/entity/gambler.png");
    
    @Override
    public ResourceLocation getModelResource(AbstractSpellCastingMob arg0)
    {
        return MODEL;
    }
    
	@Override
	public ResourceLocation getTextureResource(AbstractSpellCastingMob arg0) 
	{
		return TEXTURE;
	}
}
