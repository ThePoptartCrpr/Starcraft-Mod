package scmc.entity.layers;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scmc.entity.EntityZerglingRaptor;
import scmc.lib.Reference;
import scmc.renderer.RenderZerglingRaptor;

@SideOnly(Side.CLIENT)
public class LayerZerglingRaptor<T extends EntityZerglingRaptor> implements LayerRenderer<T>
{
    private static final ResourceLocation ZERGLINGRAPTOR_LAYER = new ResourceLocation(Reference.RL_BASE + "textures/entity/zergling_layer.png");
    private final RenderZerglingRaptor<T> zerglingRaptorRenderer;

    public LayerZerglingRaptor(RenderZerglingRaptor<T> zerglingRaptorRendererIn)
    {
        this.zerglingRaptorRenderer = zerglingRaptorRendererIn;
    }

    public void doRenderLayer(EntityZerglingRaptor entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        this.zerglingRaptorRenderer.bindTexture(ZERGLINGRAPTOR_LAYER);
        GlStateManager.enableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);

        if (entitylivingbaseIn.isInvisible())
        {
            GlStateManager.depthMask(false);
        }
        else
        {
            GlStateManager.depthMask(true);
        }

        int i = 61680;
        int j = i % 65536;
        int k = i / 65536;
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.zerglingRaptorRenderer.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        i = entitylivingbaseIn.getBrightnessForRender(partialTicks);
        j = i % 65536;
        k = i / 65536;
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
        this.zerglingRaptorRenderer.setLightmap(entitylivingbaseIn, partialTicks);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
    }

    @Override
    public boolean shouldCombineTextures()
    {
        return false;
    }
}