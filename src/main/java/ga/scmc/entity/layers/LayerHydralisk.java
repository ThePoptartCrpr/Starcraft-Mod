package ga.scmc.entity.layers;

import ga.scmc.entity.EntityHydralisk;
import ga.scmc.lib.Reference;
import ga.scmc.renderer.RenderHydralisk;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerHydralisk<T extends EntityHydralisk> implements LayerRenderer<T> {
    private static final ResourceLocation HYDRALISK_LAYER = new ResourceLocation(Reference.RL_BASE + "textures/entity/hydralisk_layer.png");
    private final RenderHydralisk<T> hydraliskRenderer;

    public LayerHydralisk(RenderHydralisk<T> hydraliskRendererIn) {
        hydraliskRenderer = hydraliskRendererIn;
    }

    @Override
    public void doRenderLayer(EntityHydralisk entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        hydraliskRenderer.bindTexture(HYDRALISK_LAYER);
        GlStateManager.enableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);

        if(entitylivingbaseIn.isInvisible()){
            GlStateManager.depthMask(false);
        } else {
            GlStateManager.depthMask(true);
        }

        int i = 61680;
        int j = i % 65536;
        int k = i / 65536;
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        hydraliskRenderer.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        i = entitylivingbaseIn.getBrightnessForRender(partialTicks);
        j = i % 65536;
        k = i / 65536;
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
        hydraliskRenderer.setLightmap(entitylivingbaseIn, partialTicks);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }
}
