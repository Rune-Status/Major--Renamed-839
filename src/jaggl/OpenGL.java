package jaggl;

import java.awt.Canvas;
import java.util.Hashtable;

public class OpenGL {

	public static final int GL_TEXTURE_2D = 0x0DE1;

	long peer;
	private Hashtable aHashtable690;
	private Thread aThread691;
	private static Hashtable aHashtable692 = new Hashtable();
	public static final int anInt693 = 5120;
	public static final int anInt694 = 5121;
	public static final int anInt695 = 5122;
	public static final int anInt696 = 5123;
	public static final int anInt697 = 5124;
	public static final int anInt698 = 5125;
	public static final int anInt699 = 5126;
	public static final int anInt700 = 0;
	public static final int anInt701 = 1;
	public static final int anInt702 = 2;
	public static final int anInt703 = 3;
	public static final int anInt704 = 4;
	public static final int anInt705 = 5;
	public static final int anInt706 = 6;
	public static final int anInt707 = 7;
	public static final int anInt708 = 5888;
	public static final int anInt709 = 5889;
	public static final int anInt710 = 5890;
	public static final int anInt711 = 2832;
	public static final int anInt712 = 2834;
	public static final int anInt713 = 6913;
	public static final int anInt714 = 6914;
	public static final int anInt715 = 1028;
	public static final int anInt716 = 1029;
	public static final int anInt717 = 2884;
	public static final int anInt718 = 4864;
	public static final int anInt719 = 515;
	public static final int anInt720 = 516;
	public static final int anInt721 = 2929;
	public static final int anInt722 = 6402;
	public static final int anInt723 = 2896;
	public static final int anInt724 = 16384;
	public static final int anInt725 = 16385;
	public static final int anInt726 = 16386;
	public static final int anInt727 = 4615;
	public static final int anInt728 = 4616;
	public static final int anInt729 = 4617;
	public static final int anInt730 = 4608;
	public static final int anInt731 = 4609;
	public static final int anInt732 = 4611;
	public static final int anInt733 = 5634;
	public static final int anInt734 = 2899;
	public static final int anInt735 = 1032;
	public static final int anInt736 = 7425;
	public static final int anInt737 = 2903;
	public static final int anInt738 = 260;
	public static final int anInt739 = 3008;
	public static final int anInt740 = 3042;
	public static final int anInt741 = 0;
	public static final int anInt742 = 1;
	public static final int anInt743 = 768;
	public static final int anInt744 = 769;
	public static final int anInt745 = 770;
	public static final int anInt746 = 771;
	public static final int anInt747 = 774;
	public static final int anInt748 = 2912;
	public static final int anInt749 = 2917;
	public static final int anInt750 = 2914;
	public static final int anInt751 = 2918;
	public static final int anInt752 = 2915;
	public static final int anInt753 = 2916;
	public static final int anInt754 = 9729;
	public static final int anInt755 = 7681;
	public static final int anInt756 = 6406;
	public static final int anInt757 = 6409;
	public static final int anInt758 = 6410;
	public static final int anInt759 = 6144;
	public static final int anInt760 = 6407;
	public static final int anInt761 = 6408;
	public static final int anInt762 = 2982;
	public static final int anInt763 = 3156;
	public static final int anInt764 = 4353;
	public static final int anInt765 = 3089;
	public static final int anInt766 = 3348;
	public static final int anInt767 = 3349;
	public static final int anInt768 = 3352;
	public static final int anInt769 = 3353;
	public static final int anInt770 = 3354;
	public static final int anInt771 = 3355;
	public static final int anInt772 = 3317;
	public static final int anInt773 = 3314;
	public static final int anInt774 = 8960;
	public static final int anInt775 = 8704;
	public static final int anInt776 = 3552;
	public static final int anInt777 = 3553;
	public static final int anInt778 = 10242;
	public static final int anInt779 = 10243;
	public static final int anInt780 = 10240;
	public static final int anInt781 = 10241;
	public static final int anInt782 = 8705;
	public static final int anInt783 = 3168;
	public static final int anInt784 = 3169;
	public static final int anInt785 = 9472;
	public static final int anInt786 = 9984;
	public static final int anInt787 = 9987;
	public static final int anInt788 = 9217;
	public static final int anInt789 = 9473;
	public static final int anInt790 = 9216;
	public static final int anInt791 = 9474;
	public static final int anInt792 = 8448;
	public static final int anInt793 = 9728;
	public static final int anInt794 = 10497;
	public static final int anInt795 = 8192;
	public static final int anInt796 = 8193;
	public static final int anInt797 = 8194;
	public static final int anInt798 = 8195;
	public static final int anInt799 = 3170;
	public static final int anInt800 = 3171;
	public static final int anInt801 = 7936;
	public static final int anInt802 = 7937;
	public static final int anInt803 = 7938;
	private static final int anInt804 = 7939;
	public static final int anInt805 = 256;
	public static final int anInt806 = 1024;
	public static final int anInt807 = 2048;
	public static final int anInt808 = 16384;
	public static final int anInt809 = 32830;
	public static final int anInt810 = 32834;
	public static final int anInt811 = 32852;
	public static final int anInt812 = 32859;
	public static final int anInt813 = 32884;
	public static final int anInt814 = 32885;
	public static final int anInt815 = 32886;
	public static final int anInt816 = 32888;
	public static final int anInt817 = 32879;
	public static final int anInt818 = 33639;
	public static final int anInt819 = 32993;
	public static final int anInt820 = 33071;
	public static final int anInt821 = 33984;
	public static final int anInt822 = 33985;
	public static final int anInt823 = 34018;
	public static final int anInt824 = 32925;
	public static final int anInt825 = 32926;
	public static final int anInt826 = 34065;
	public static final int anInt827 = 34066;
	public static final int anInt828 = 34067;
	public static final int anInt829 = 34069;
	public static final int anInt830 = 34070;
	public static final int anInt831 = 34071;
	public static final int anInt832 = 34072;
	public static final int anInt833 = 34073;
	public static final int anInt834 = 34074;
	public static final int anInt835 = 34160;
	public static final int anInt836 = 34161;
	public static final int anInt837 = 34162;
	public static final int anInt838 = 34176;
	public static final int anInt839 = 34178;
	public static final int anInt840 = 34184;
	public static final int anInt841 = 34186;
	public static final int anInt842 = 34192;
	public static final int anInt843 = 34200;
	public static final int anInt844 = 34163;
	public static final int anInt845 = 34165;
	public static final int anInt846 = 34023;
	public static final int anInt847 = 34166;
	public static final int anInt848 = 34167;
	public static final int anInt849 = 34168;
	public static final int anInt850 = 34479;
	public static final int anInt851 = 33189;
	public static final int anInt852 = 33190;
	public static final int anInt853 = 33191;
	public static final int anInt854 = 34895;
	public static final int anInt855 = 35000;
	public static final int anInt856 = 35001;
	public static final int anInt857 = 35041;
	public static final int anInt858 = 34929;
	public static final int anInt859 = 34930;
	public static final int anInt860 = 35632;
	public static final int anInt861 = 35633;
	public static final int anInt862 = 35724;
	public static final int anInt863 = 35051;
	public static final int anInt864 = 34336;
	public static final int anInt865 = 34379;
	public static final int anInt866 = 34933;
	public static final int anInt867 = 34820;
	public static final int anInt868 = 34962;
	public static final int anInt869 = 34963;
	public static final int anInt870 = 35040;
	public static final int anInt871 = 35044;
	public static final int anInt872 = 35713;
	public static final int anInt873 = 35714;
	public static final int anInt874 = 35716;
	public static final int anInt875 = 35633;
	public static final int anInt876 = 35632;
	public static final int anInt877 = 34037;
	public static final int anInt878 = 5131;
	public static final int anInt879 = 34836;
	public static final int anInt880 = 34837;
	public static final int anInt881 = 34838;
	public static final int anInt882 = 34840;
	public static final int anInt883 = 34841;
	public static final int anInt884 = 34842;
	public static final int anInt885 = 34843;
	public static final int anInt886 = 34844;
	public static final int anInt887 = 34846;
	public static final int anInt888 = 34847;
	public static final int anInt889 = 33777;
	public static final int anInt890 = 33779;
	public static final int anInt891 = 36053;
	public static final int anInt892 = 36064;
	public static final int anInt893 = 36096;
	public static final int anInt894 = 36160;
	public static final int anInt895 = 36161;
	public static final int anInt896 = 36008;
	public static final int anInt897 = 36219;
	public static final int anInt898 = 37143;
	public static final int anInt899 = 37147;
	public static final int anInt900 = 37149;

	public native long init(Canvas canvas, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_);

	public native boolean arePbuffersAvailable();

	public boolean method1385(String string) {
		if (null == aHashtable690) {
			aHashtable690 = new Hashtable();
			String string_5_ = glGetString(7939);

			int i = 0;
			for (;;) {
				int i_6_ = string_5_.indexOf(' ', i);
				if (-1 == i_6_) {
					break;
				}

				String string_7_ = string_5_.substring(i, i_6_).trim();
				if (string_7_.length() != 0) {
					aHashtable690.put(string_7_, string_7_);
				}
				i = 1 + i_6_;
			}

			String string_8_ = string_5_.substring(i).trim();
			if (string_8_.length() != 0) {
				aHashtable690.put(string_8_, string_8_);
			}
		}

		return aHashtable690.containsKey(string);
	}

	public synchronized boolean method1386() {
		Thread thread = Thread.currentThread();
		if (attachPeer()) {
			OpenGL gl = (OpenGL) aHashtable692.put(thread, this);
			if (null != gl) {
				gl.aThread691 = null;
			}

			aThread691 = thread;
			return true;
		}
		return false;
	}

	public synchronized boolean method1387() {
		if (aThread691 != Thread.currentThread()) {
			return false;
		}
		detachPeer();
		aHashtable692.remove(aThread691);
		aThread691 = null;
		return true;
	}

	private native boolean attachPeer();

	private native void detachPeer();

	public native long prepareSurface(Canvas canvas);

	public native void surfaceResized(long l);

	public native void releaseSurface(Canvas canvas, long l);

	public native boolean setSurface(long l);

	public native long createPbuffer(int i, int i_10_);

	public native void releasePbuffer(long l);

	public native void setPbuffer(long l);

	public native void swapBuffers(long l);

	public native void setSwapInterval(int i);

	public native void release();

	public static native void glEnable(int i);

	/**
	 * https://www.opengl.org/sdk/docs/man2/xhtml/glEnable.xml
	 */
	public static native void glDisable(int i);

	public static native void glCullFace(int i);

	public static native void glPushAttrib(int i);

	public static native void glPopAttrib();

	public static native void glShadeModel(int i);

	public static native void glHint(int i, int i_11_);

	public static native void glFinish();

	public static native void glFlush();

	public static native void glClear(int i);

	public static native void glClearColor(float f, float f_12_, float f_13_, float f_14_);

	public static native void glClearDepth(float f);

	public static native void glDepthFunc(int i);

	public static native void glDepthMask(boolean bool);

	public static native void glDepthRange(float f, float f_15_);

	public static native void glAlphaFunc(int i, float f);

	public static native void glColorMask(boolean bool, boolean bool_16_, boolean bool_17_, boolean bool_18_);

	public static native void glReadBuffer(int i);

	public static native void glDrawBuffer(int i);

	public static native void glDrawBuffersARB(int i, int[] is, int i_19_);

	public static native void glMatrixMode(int i);

	public static native void glPushMatrix();

	public static native void glPopMatrix();

	public static native void glLoadIdentity();

	public static native void glOrtho(double d, double d_20_, double d_21_, double d_22_, double d_23_, double d_24_);

	public static native void glFrustum(double d, double d_25_, double d_26_, double d_27_, double d_28_, double d_29_);

	public static native void glTranslatef(float f, float f_30_, float f_31_);

	public static native void glRotatef(float f, float f_32_, float f_33_, float f_34_);

	public static native void glScalef(float f, float f_35_, float f_36_);

	public static native void glLoadMatrixf(float[] fs, int i);

	public static native void glMultMatrixf(float[] fs, int i);

	/**
	 * https://www.khronos.org/opengles/sdk/docs/man/xhtml/glViewport.xml
	 */
	public static native void glViewport(int x, int y, int width, int height);

	public static native void glScissor(int i, int i_40_, int i_41_, int i_42_);

	/**
	 * https://www.opengl.org/sdk/docs/man2/xhtml/glGenLists.xml
	 */
	public static native int glGenLists(int range);

	public static native void glDeleteLists(int i, int i_43_);

	/**
	 * https://www.opengl.org/sdk/docs/man2/xhtml/glNewList.xml
	 */
	public static native void glNewList(int list, int mode);

	/**
	 * https://www.opengl.org/sdk/docs/man2/xhtml/glNewList.xml
	 */
	public static native void glEndList();

	/**
	 * https://www.opengl.org/sdk/docs/man2/xhtml/glCallList.xml
	 */
	public static native void glCallList(int list);

	public static native void glBegin(int i);

	public static native void glVertex2i(int i, int i_45_);

	public static native void glVertex2f(float f, float f_46_);

	public static native void glVertex3f(float f, float f_47_, float f_48_);

	public static native void glNormal3f(float f, float f_49_, float f_50_);

	public static native void glColor3f(float f, float f_51_, float f_52_);

	public static native void glColor4f(float f, float f_53_, float f_54_, float f_55_);

	public static native void glColor3ub(byte i, byte i_56_, byte i_57_);

	public static native void glColor4ub(byte i, byte i_58_, byte i_59_, byte i_60_);

	public static native void glTexCoord2i(int i, int i_61_);

	public static native void glTexCoord3i(int i, int i_62_, int i_63_);

	public static native void glTexCoord2f(float f, float f_64_);

	public static native void glTexCoord3f(float f, float f_65_, float f_66_);

	public static native void glMultiTexCoord2i(int i, int i_67_, int i_68_);

	public static native void glMultiTexCoord3i(int i, int i_69_, int i_70_, int i_71_);

	public static native void glMultiTexCoord2f(int i, float f, float f_72_);

	public static native void glRasterPos2i(int i, int i_73_);

	public static native void glEnd();

	public static native void glEnableClientState(int i);

	public static native void glDisableClientState(int i);

	public static native void glClientActiveTexture(int i);

	public static native void glVertexPointer(int i, int i_74_, int i_75_, long l);

	public static native void glNormalPointer(int i, int i_76_, long l);

	public static native void glColorPointer(int i, int i_77_, int i_78_, long l);

	public static native void glTexCoordPointer(int i, int i_79_, int i_80_, long l);

	public static native void glVertexAttribPointer(int i, int i_81_, int i_82_, boolean bool, int i_83_, long l);

	public static native void glEnableVertexAttribArray(int i);

	public static native void glDisableVertexAttribArray(int i);

	public static native void glBindAttribLocation(int i, int i_84_, String string);

	public static native int glGetAttribLocation(int i, String string);

	public static native void glGenBuffersARB(int i, int[] parameters, int i_85_);

	public static native void glBindBufferARB(int target, int identifier);

	public static native void glBufferDataARBa(int i, int i_87_, long l, int i_88_);

	public static native void glBufferDataARBub(int target, int length, byte[] buffer, int i_90_, int i_91_);

	public static native void glBufferSubDataARBa(int target, int offset, int length, long source);

	public static native void glBufferSubDataARBub(int target, int i_94_, int length, byte[] buffer, int i_96_);

	public static native long glMapBufferARB(int i, int i_97_);

	public static native boolean glUnmapBufferARB(int i);

	public static native void glDeleteBuffersARB(int i, int[] is, int i_98_);

	public static native void glLineWidth(float f);

	public static native void glPointSize(float f);

	public static native void glPolygonMode(int i, int i_99_);

	public static native void glDrawArrays(int i, int i_100_, int i_101_);

	public static native void glDrawElements(int i, int i_102_, int i_103_, long l);

	public static native void glGenTextures(int amount, int[] parameters, int i_104_);

	public static native void glDeleteTextures(int i, int[] is, int i_105_);

	public static native void glActiveTexture(int i);

	public static native void glBindTexture(int target, int texture);

	public static native void glTexEnvi(int i, int i_107_, int i_108_);

	public static native void glTexEnvf(int i, int i_109_, float f);

	public static native void glTexEnvfv(int i, int i_110_, float[] fs, int i_111_);

	public static native void glTexGeni(int i, int i_112_, int i_113_);

	public static native void glTexGenfv(int i, int i_114_, float[] fs, int i_115_);

	public static native void glTexParameterf(int i, int i_116_, float f);

	public static native void glTexParameteri(int i, int i_117_, int i_118_);

	/**
	 * https://www.opengl.org/sdk/docs/man3/xhtml/glGetTexImage.xml
	 */
	public static native void glGetTexImagei(int target, int level, int format, int type, int[] image, int i_122_);

	public static native void glGetTexImageub(int i, int i_123_, int i_124_, int i_125_, byte[] is, int i_126_);

	public static native float glGetTexLevelParameterfv(int i, int i_127_, int i_128_);

	public static native int glGetTexLevelParameteriv(int i, int i_129_, int i_130_);

	public static native void glGetTexImage(int i, int i_131_, int i_132_, int i_133_, byte[] is);

	public static native void glTexImage1Dub(int i, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_,
			int i_139_, byte[] is, int i_140_);

	/**
	 * https://www.opengl.org/sdk/docs/man3/xhtml/glCopyTexImage2D.xml
	 */
	public static native void glCopyTexImage2D(int target, int level, int internalFormat, int x, int y, int width,
			int height, int border);

	/**
	 * https://www.opengl.org/sdk/docs/man2/xhtml/glCopyTexSubImage2D.xml
	 */
	public static native void glCopyTexSubImage2D(int target, int level, int offsetX, int offsetY, int x, int y,
			int width, int height);

	/**
	 * https://www.khronos.org/opengles/sdk/docs/man/xhtml/glTexImage2D.xml
	 */
	public static native void glTexImage2Di(int target, int level, int internalFormat, int width, int height,
			int border, int format, int type, int[] data, int i_162_);

	/**
	 * https://www.khronos.org/opengles/sdk/docs/man/xhtml/glTexImage2D.xml
	 */
	public static native void glTexImage2Df(int target, int level, int internalFormat, int width, int height,
			int i_167_, int format, int i_169_, float[] data, int i_170_);

	/**
	 * https://www.khronos.org/opengles/sdk/docs/man/xhtml/glTexImage2D.xml
	 */
	public static native void glTexImage2Dub(int target, int level, int internalFormat, int width, int height,
			int i_175_, int format, int i_177_, byte[] data, int i_178_);

	public static native void glTexSubImage2Di(int target, int level, int internalFormat, int width, int height,
			int i_183_, int format, int i_185_, int[] data, int i_186_);

	public static native void glTexSubImage2Df(int i, int i_187_, int i_188_, int i_189_, int i_190_, int i_191_,
			int i_192_, int i_193_, float[] fs, int i_194_);

	/**
	 * https://www.khronos.org/opengles/sdk/docs/man/xhtml/glTexSubImage2D.xml
	 */
	public static native void glTexSubImage2Dub(int target, int level, int offsetX, int offsetY, int width, int height,
			int format, int type, byte[] is, int i_202_);

	public static native void glCopyTexSubImage3D(int i, int i_203_, int i_204_, int i_205_, int i_206_, int i_207_,
			int i_208_, int i_209_, int i_210_);

	public static native void glTexImage3Dub(int target, int i_211_, int i_212_, int i_213_, int i_214_, int i_215_,
			int i_216_, int i_217_, int i_218_, byte[] is, int i_219_);

	public static native void glCompressedTexImage2Dub(int i, int i_220_, int i_221_, int i_222_, int i_223_,
			int i_224_, int i_225_, byte[] is, int i_226_);

	public static native void glCopyPixels(int i, int i_227_, int i_228_, int i_229_, int i_230_);

	public static native void glReadPixelsi(int i, int i_231_, int i_232_, int i_233_, int i_234_, int i_235_,
			int[] is, int i_236_);

	public static native void glReadPixelsub(int i, int i_237_, int i_238_, int i_239_, int i_240_, int i_241_,
			byte[] is, int i_242_);

	public static native void glDrawPixelsi(int i, int i_243_, int i_244_, int i_245_, int[] is, int i_246_);

	public static native void glDrawPixelsub(int i, int i_247_, int i_248_, int i_249_, byte[] is, int i_250_);

	public static native void glPixelZoom(float f, float f_251_);

	/**
	 * https://www.khronos.org/opengles/sdk/docs/man/xhtml/glPixelStorei.xml
	 *
	 * GL_UNPACK_ROW_LENGTH = 0x0CF2
	 */
	public static native void glPixelStorei(int parameter, int value);

	public static native void glPixelTransferf(int i, float f);

	public static native void glColorMaterial(int i, int i_253_);

	public static native void glLightf(int i, int i_254_, float f);

	public static native void glLightfv(int i, int i_255_, float[] fs, int i_256_);

	public static native void glLightModelfv(int i, float[] fs, int i_257_);

	public static native void glMaterialfv(int i, int i_258_, float[] fs, int i_259_);

	public static native void glFogi(int i, int i_260_);

	public static native void glFogf(int i, float f);

	public static native void glFogfv(int i, float[] fs, int i_261_);

	public static native void glBlendFunc(int i, int i_262_);

	public static native void glBlendFuncSeparate(int i, int i_263_, int i_264_, int i_265_);

	public static native void glBlendColor(float f, float f_266_, float f_267_, float f_268_);

	public static native void glGenFramebuffersEXT(int i, int[] is, int i_269_);

	public static native void glDeleteFramebuffersEXT(int i, int[] is, int i_270_);

	public static native void glBindFramebufferEXT(int i, int i_271_);

	public static native void glFramebufferTexture2DEXT(int i, int i_272_, int i_273_, int i_274_, int i_275_);

	public static native void glFramebufferTexture3DEXT(int i, int i_276_, int i_277_, int i_278_, int i_279_,
			int i_280_);

	public static native void glFramebufferRenderbufferEXT(int i, int i_281_, int i_282_, int i_283_);

	public static native int glCheckFramebufferStatusEXT(int i);

	public static native void glBlitFramebufferEXT(int i, int i_284_, int i_285_, int i_286_, int i_287_, int i_288_,
			int i_289_, int i_290_, int i_291_, int i_292_);

	public static native void glGenerateMipmapEXT(int i);

	public static native void glGenRenderbuffersEXT(int i, int[] is, int i_293_);

	public static native void glDeleteRenderbuffersEXT(int i, int[] is, int i_294_);

	public static native void glBindRenderbufferEXT(int i, int i_295_);

	public static native void glRenderbufferStorageEXT(int i, int i_296_, int i_297_, int i_298_);

	public static native void glRenderbufferStorageMultisampleEXT(int i, int i_299_, int i_300_, int i_301_, int i_302_);

	public static native int glGenProgramARB();

	public static native void glDeleteProgramARB(int program);

	public static native void glBindProgramARB(int i, int program);

	public static native void glProgramStringARB(int target, int format, String string);

	public static native void glProgramRawARB(int i, int i_305_, byte[] is);

	public static native void glProgramLocalParameter4fARB(int i, int i_306_, float f, float f_307_, float f_308_,
			float f_309_);

	public static native void glProgramLocalParameter4fvARB(int i, int i_310_, float[] fs, int i_311_);

	public static native void glGetProgramivARB(int i, int i_312_, int[] is, int i_313_);

	public static native int glCreateProgram();

	/**
	 * https://www.opengl.org/sdk/docs/man/html/glCreateShader.xhtml
	 *
	 * @param shader The shader type.
	 * @return The reference.
	 */
	public static native int glCreateShader(int type);

	public static native void glDeleteProgram(int program);

	public static native void glDeleteShader(int shader);

	public static native void glShaderSource(int shader, String string);

	public static native void glCompileShader(int shader);

	public static native void glAttachShader(int program, int shader);

	public static native void glDetachShader(int program, int shader);

	public static native void glLinkProgram(int program);

	public static native void glUseProgram(int program);

	/**
	 * https://www.opengl.org/sdk/docs/man/docbook4/xhtml/glGetUniformLocation.xml
	 */
	public static native int glGetUniformLocation(int program, String name);

	/**
	 * https://www.opengl.org/sdk/docs/man/html/glUniform.xhtml
	 */
	public static native void glUniform1i(int location, int i_316_);

	/**
	 * https://www.opengl.org/sdk/docs/man/html/glUniform.xhtml
	 */
	public static native void glUniform1f(int location, float f);

	/**
	 * https://www.opengl.org/sdk/docs/man/html/glUniform.xhtml
	 */
	public static native void glUniform2f(int location, float f, float f_317_);

	/**
	 * https://www.opengl.org/sdk/docs/man/html/glUniform.xhtml
	 */
	public static native void glUniform3f(int location, float f, float f_318_, float f_319_);

	/**
	 * https://www.opengl.org/sdk/docs/man/html/glUniform.xhtml
	 */
	public static native void glUniform4f(int location, float f, float f_320_, float f_321_, float f_322_);

	/**
	 * https://www.opengl.org/sdk/docs/man/html/glUniform.xhtml
	 */
	public static native void glUniform1fv(int location, int i_323_, float[] fs, int i_324_);

	/**
	 * https://www.opengl.org/sdk/docs/man/html/glUniform.xhtml
	 */
	public static native void glUniform2fv(int location, int i_325_, float[] fs, int i_326_);

	/**
	 * https://www.opengl.org/sdk/docs/man/html/glUniform.xhtml
	 */
	public static native void glUniform3fv(int location, int i_327_, float[] fs, int i_328_);

	/**
	 * https://www.opengl.org/sdk/docs/man/html/glUniform.xhtml
	 */
	public static native void glUniform4fv(int location, int i_329_, float[] fs, int i_330_);

	public static native void glUniformMatrix2fv(int i, int i_331_, boolean bool, float[] fs, int i_332_);

	public static native void glUniformMatrix3fv(int i, int i_333_, boolean bool, float[] fs, int i_334_);

	public static native void glUniformMatrix4fv(int i, int i_335_, boolean bool, float[] fs, int i_336_);

	public static native void glGetProgramiv(int i, int i_337_, int[] is, int i_338_);

	public static native void glGetShaderiv(int i, int i_339_, int[] is, int i_340_);

	public static native void glGetProgramInfoLog(int i, int i_341_, int[] is, int i_342_, byte[] is_343_, int i_344_);

	public static native void glGetShaderInfoLog(int i, int i_345_, int[] is, int i_346_, byte[] is_347_, int i_348_);

	public static native int glGetError();

	public static native String glGetString(int i);

	public static native void glGetFloatv(int i, float[] fs, int i_349_);

	public static native void glGetIntegerv(int i, int[] is, int i_350_);

	public static native void glStencilFunc(int i, int i_351_, int i_352_);

	public static native void glStencilOp(int i, int i_353_, int i_354_);

	public static native long glFenceSync(int i, int i_355_);

	public static native boolean glIsSync(long l);

	public static native void glDeleteSync(long l);

	public static native int glClientWaitSync(long l, int i, int i_356_);

	public static native void glWaitSync(long l, int i, int i_357_);
}
