/**
 *
 */
package jp.saitama.muchan.quickdial;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources.NotFoundException;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * @author muchan
 *
 */
public class Setting extends PreferenceActivity {

	PreferenceScreen screenPrefDialRoot1;
	PreferenceScreen screenPrefDialRoot2;
	PreferenceScreen screenPrefDialRoot3;
	PreferenceScreen screenPrefDialRoot4;
	PreferenceScreen screenPrefDialRoot5;
	PreferenceScreen screenPrefDialRoot6;
	PreferenceScreen screenPrefDialRoot7;
	PreferenceScreen screenPrefDialRoot8;
	PreferenceScreen screenPrefDialRoot9;
	PreferenceScreen screenPrefDialRoot10;
	PreferenceScreen screenPrefDialRoot11;
	PreferenceScreen screenPrefDialRoot12;
	PreferenceScreen screenPrefDialRoot13;
	PreferenceScreen screenPrefDialRoot14;
	PreferenceScreen screenPrefDialRoot15;
	PreferenceScreen screenPrefDialRoot16;
	PreferenceScreen screenPrefDialRoot17;
	PreferenceScreen screenPrefDialRoot18;
	PreferenceScreen screenPrefDialRoot19;
	PreferenceScreen screenPrefDialRoot20;
	PreferenceScreen screenPrefDialRoot21;
	PreferenceScreen screenPrefDialRoot22;
	PreferenceScreen screenPrefDialRoot23;
	PreferenceScreen screenPrefDialRoot24;
	PreferenceScreen screenPrefDialRoot25;
	PreferenceScreen screenPrefDialRoot26;
	PreferenceScreen screenPrefDialRoot27;
	PreferenceScreen screenPrefDialRoot28;
	PreferenceScreen screenPrefDialRoot29;
	PreferenceScreen screenPrefDialRoot30;
	PreferenceScreen screenPrefDialRoot31;
	PreferenceScreen screenPrefDialRoot32;
	PreferenceScreen screenPrefDialRoot33;
	PreferenceScreen screenPrefDialRoot34;
	PreferenceScreen screenPrefDialRoot35;
	PreferenceScreen screenPrefDialRoot36;
	PreferenceScreen screenPrefDialRoot37;
	PreferenceScreen screenPrefDialRoot38;
	PreferenceScreen screenPrefDialRoot39;
	PreferenceScreen screenPrefDialRoot40;

	PreferenceScreen screenPref1;
	PreferenceScreen screenPref2;
	PreferenceScreen screenPref3;
	PreferenceScreen screenPref4;
	PreferenceScreen screenPref5;
	PreferenceScreen screenPref6;
	PreferenceScreen screenPref7;
	PreferenceScreen screenPref8;
	PreferenceScreen screenPref9;
	PreferenceScreen screenPref10;
	PreferenceScreen screenPref11;
	PreferenceScreen screenPref12;
	PreferenceScreen screenPref13;
	PreferenceScreen screenPref14;
	PreferenceScreen screenPref15;
	PreferenceScreen screenPref16;
	PreferenceScreen screenPref17;
	PreferenceScreen screenPref18;
	PreferenceScreen screenPref19;
	PreferenceScreen screenPref20;
	PreferenceScreen screenPref21;
	PreferenceScreen screenPref22;
	PreferenceScreen screenPref23;
	PreferenceScreen screenPref24;
	PreferenceScreen screenPref25;
	PreferenceScreen screenPref26;
	PreferenceScreen screenPref27;
	PreferenceScreen screenPref28;
	PreferenceScreen screenPref29;
	PreferenceScreen screenPref30;
	PreferenceScreen screenPref31;
	PreferenceScreen screenPref32;
	PreferenceScreen screenPref33;
	PreferenceScreen screenPref34;
	PreferenceScreen screenPref35;
	PreferenceScreen screenPref36;
	PreferenceScreen screenPref37;
	PreferenceScreen screenPref38;
	PreferenceScreen screenPref39;
	PreferenceScreen screenPref40;

	PreferenceScreen screenPref_del1;
	PreferenceScreen screenPref_del2;
	PreferenceScreen screenPref_del3;
	PreferenceScreen screenPref_del4;
	PreferenceScreen screenPref_del5;
	PreferenceScreen screenPref_del6;
	PreferenceScreen screenPref_del7;
	PreferenceScreen screenPref_del8;
	PreferenceScreen screenPref_del9;
	PreferenceScreen screenPref_del10;
	PreferenceScreen screenPref_del11;
	PreferenceScreen screenPref_del12;
	PreferenceScreen screenPref_del13;
	PreferenceScreen screenPref_del14;
	PreferenceScreen screenPref_del15;
	PreferenceScreen screenPref_del16;
	PreferenceScreen screenPref_del17;
	PreferenceScreen screenPref_del18;
	PreferenceScreen screenPref_del19;
	PreferenceScreen screenPref_del20;
	PreferenceScreen screenPref_del21;
	PreferenceScreen screenPref_del22;
	PreferenceScreen screenPref_del23;
	PreferenceScreen screenPref_del24;
	PreferenceScreen screenPref_del25;
	PreferenceScreen screenPref_del26;
	PreferenceScreen screenPref_del27;
	PreferenceScreen screenPref_del28;
	PreferenceScreen screenPref_del29;
	PreferenceScreen screenPref_del30;
	PreferenceScreen screenPref_del31;
	PreferenceScreen screenPref_del32;
	PreferenceScreen screenPref_del33;
	PreferenceScreen screenPref_del34;
	PreferenceScreen screenPref_del35;
	PreferenceScreen screenPref_del36;
	PreferenceScreen screenPref_del37;
	PreferenceScreen screenPref_del38;
	PreferenceScreen screenPref_del39;
	PreferenceScreen screenPref_del40;

	ListPreference listDialOrCall;
	ListPreference listListHeight;
	ListPreference listCharSize;
	ListPreference listTheme;

	EditTextPreference editTextTab1;
	EditTextPreference editTextTab2;
	EditTextPreference editTextTab3;
	EditTextPreference editTextTab4;
	EditTextPreference editTextTab5;

	private static final int REQUEST_PICK_CONTACT1 = 1;
	private static final int REQUEST_PICK_CONTACT2 = 2;
	private static final int REQUEST_PICK_CONTACT3 = 3;
	private static final int REQUEST_PICK_CONTACT4 = 4;
	private static final int REQUEST_PICK_CONTACT5 = 5;
	private static final int REQUEST_PICK_CONTACT6 = 6;
	private static final int REQUEST_PICK_CONTACT7 = 7;
	private static final int REQUEST_PICK_CONTACT8 = 8;
	private static final int REQUEST_PICK_CONTACT9 = 9;
	private static final int REQUEST_PICK_CONTACT10 = 10;
	private static final int REQUEST_PICK_CONTACT11 = 11;
	private static final int REQUEST_PICK_CONTACT12 = 12;
	private static final int REQUEST_PICK_CONTACT13 = 13;
	private static final int REQUEST_PICK_CONTACT14 = 14;
	private static final int REQUEST_PICK_CONTACT15 = 15;
	private static final int REQUEST_PICK_CONTACT16 = 16;
	private static final int REQUEST_PICK_CONTACT17 = 17;
	private static final int REQUEST_PICK_CONTACT18 = 18;
	private static final int REQUEST_PICK_CONTACT19 = 19;
	private static final int REQUEST_PICK_CONTACT20 = 20;
	private static final int REQUEST_PICK_CONTACT21 = 21;
	private static final int REQUEST_PICK_CONTACT22 = 22;
	private static final int REQUEST_PICK_CONTACT23 = 23;
	private static final int REQUEST_PICK_CONTACT24 = 24;
	private static final int REQUEST_PICK_CONTACT25 = 25;
	private static final int REQUEST_PICK_CONTACT26 = 26;
	private static final int REQUEST_PICK_CONTACT27 = 27;
	private static final int REQUEST_PICK_CONTACT28 = 28;
	private static final int REQUEST_PICK_CONTACT29 = 29;
	private static final int REQUEST_PICK_CONTACT30 = 30;
	private static final int REQUEST_PICK_CONTACT31 = 31;
	private static final int REQUEST_PICK_CONTACT32 = 32;
	private static final int REQUEST_PICK_CONTACT33 = 33;
	private static final int REQUEST_PICK_CONTACT34 = 34;
	private static final int REQUEST_PICK_CONTACT35 = 35;
	private static final int REQUEST_PICK_CONTACT36 = 36;
	private static final int REQUEST_PICK_CONTACT37 = 37;
	private static final int REQUEST_PICK_CONTACT38 = 38;
	private static final int REQUEST_PICK_CONTACT39 = 39;
	private static final int REQUEST_PICK_CONTACT40 = 40;

	public ProgressDialog progressDialog;

//	//newInstance
//    public static Setting newInstance() {
//        return new Setting();
//    }

    @Override
	public void onCreate(Bundle savedInstanceState) {
        try {
			super.onCreate(savedInstanceState);

			addPreferencesFromResource(R.xml.preference);

			Quickdial.sp.edit().commit();

			//動作設定
			listDialOrCall = (ListPreference)findPreference("selected_action_cord");
			listListHeight = (ListPreference)findPreference("selected_action_listheight");
			listCharSize = (ListPreference)findPreference("selected_action_charsize");
			listTheme = (ListPreference)findPreference("selected_action_theme");

			editTextTab1 = (EditTextPreference)findPreference("edit_text_tab1");
			editTextTab2 = (EditTextPreference)findPreference("edit_text_tab2");
			editTextTab3 = (EditTextPreference)findPreference("edit_text_tab3");
			editTextTab4 = (EditTextPreference)findPreference("edit_text_tab4");
			editTextTab5 = (EditTextPreference)findPreference("edit_text_tab5");

			screenPrefDialRoot1 = (PreferenceScreen)findPreference("pref_screen_dial_root1");
			screenPrefDialRoot2 = (PreferenceScreen)findPreference("pref_screen_dial_root2");
			screenPrefDialRoot3 = (PreferenceScreen)findPreference("pref_screen_dial_root3");
			screenPrefDialRoot4 = (PreferenceScreen)findPreference("pref_screen_dial_root4");
			screenPrefDialRoot5 = (PreferenceScreen)findPreference("pref_screen_dial_root5");
			screenPrefDialRoot6 = (PreferenceScreen)findPreference("pref_screen_dial_root6");
			screenPrefDialRoot7 = (PreferenceScreen)findPreference("pref_screen_dial_root7");
			screenPrefDialRoot8 = (PreferenceScreen)findPreference("pref_screen_dial_root8");
			screenPrefDialRoot9 = (PreferenceScreen)findPreference("pref_screen_dial_root9");
			screenPrefDialRoot10 = (PreferenceScreen)findPreference("pref_screen_dial_root10");
			screenPrefDialRoot11 = (PreferenceScreen)findPreference("pref_screen_dial_root11");
			screenPrefDialRoot12 = (PreferenceScreen)findPreference("pref_screen_dial_root12");
			screenPrefDialRoot13 = (PreferenceScreen)findPreference("pref_screen_dial_root13");
			screenPrefDialRoot14 = (PreferenceScreen)findPreference("pref_screen_dial_root14");
			screenPrefDialRoot15 = (PreferenceScreen)findPreference("pref_screen_dial_root15");
			screenPrefDialRoot16 = (PreferenceScreen)findPreference("pref_screen_dial_root16");
			screenPrefDialRoot17 = (PreferenceScreen)findPreference("pref_screen_dial_root17");
			screenPrefDialRoot18 = (PreferenceScreen)findPreference("pref_screen_dial_root18");
			screenPrefDialRoot19 = (PreferenceScreen)findPreference("pref_screen_dial_root19");
			screenPrefDialRoot20 = (PreferenceScreen)findPreference("pref_screen_dial_root20");
			screenPrefDialRoot21 = (PreferenceScreen)findPreference("pref_screen_dial_root21");
			screenPrefDialRoot22 = (PreferenceScreen)findPreference("pref_screen_dial_root22");
			screenPrefDialRoot23 = (PreferenceScreen)findPreference("pref_screen_dial_root23");
			screenPrefDialRoot24 = (PreferenceScreen)findPreference("pref_screen_dial_root24");
			screenPrefDialRoot25 = (PreferenceScreen)findPreference("pref_screen_dial_root25");
			screenPrefDialRoot26 = (PreferenceScreen)findPreference("pref_screen_dial_root26");
			screenPrefDialRoot27 = (PreferenceScreen)findPreference("pref_screen_dial_root27");
			screenPrefDialRoot28 = (PreferenceScreen)findPreference("pref_screen_dial_root28");
			screenPrefDialRoot29 = (PreferenceScreen)findPreference("pref_screen_dial_root29");
			screenPrefDialRoot30 = (PreferenceScreen)findPreference("pref_screen_dial_root30");
			screenPrefDialRoot31 = (PreferenceScreen)findPreference("pref_screen_dial_root31");
			screenPrefDialRoot32 = (PreferenceScreen)findPreference("pref_screen_dial_root32");
			screenPrefDialRoot33 = (PreferenceScreen)findPreference("pref_screen_dial_root33");
			screenPrefDialRoot34 = (PreferenceScreen)findPreference("pref_screen_dial_root34");
			screenPrefDialRoot35 = (PreferenceScreen)findPreference("pref_screen_dial_root35");
			screenPrefDialRoot36 = (PreferenceScreen)findPreference("pref_screen_dial_root36");
			screenPrefDialRoot37 = (PreferenceScreen)findPreference("pref_screen_dial_root37");
			screenPrefDialRoot38 = (PreferenceScreen)findPreference("pref_screen_dial_root38");
			screenPrefDialRoot39 = (PreferenceScreen)findPreference("pref_screen_dial_root39");
			screenPrefDialRoot40 = (PreferenceScreen)findPreference("pref_screen_dial_root40");

			//親のPreferenceScreen
			screenPrefDialRoot1.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot2.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot3.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot4.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot5.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot6.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot7.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot8.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot9.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot10.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot11.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot12.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot13.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot14.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot15.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot16.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot17.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot18.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot19.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot20.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot21.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot22.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot23.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot24.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot25.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot26.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot27.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot28.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot29.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot30.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot31.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot32.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot33.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot34.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot35.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot36.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot37.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot38.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot39.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});
			screenPrefDialRoot40.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			        return screenPrefDialRoot_OnPreferenceClick(preference);
			    }
			});

			//ダイヤル登録
			screenPref1 = (PreferenceScreen)findPreference("pref_screen1");
			screenPref2 = (PreferenceScreen)findPreference("pref_screen2");
			screenPref3 = (PreferenceScreen)findPreference("pref_screen3");
			screenPref4 = (PreferenceScreen)findPreference("pref_screen4");
			screenPref5 = (PreferenceScreen)findPreference("pref_screen5");
			screenPref6 = (PreferenceScreen)findPreference("pref_screen6");
			screenPref7 = (PreferenceScreen)findPreference("pref_screen7");
			screenPref8 = (PreferenceScreen)findPreference("pref_screen8");
			screenPref9 = (PreferenceScreen)findPreference("pref_screen9");
			screenPref10 = (PreferenceScreen)findPreference("pref_screen10");
			screenPref11 = (PreferenceScreen)findPreference("pref_screen11");
			screenPref12 = (PreferenceScreen)findPreference("pref_screen12");
			screenPref13 = (PreferenceScreen)findPreference("pref_screen13");
			screenPref14 = (PreferenceScreen)findPreference("pref_screen14");
			screenPref15 = (PreferenceScreen)findPreference("pref_screen15");
			screenPref16 = (PreferenceScreen)findPreference("pref_screen16");
			screenPref17 = (PreferenceScreen)findPreference("pref_screen17");
			screenPref18 = (PreferenceScreen)findPreference("pref_screen18");
			screenPref19 = (PreferenceScreen)findPreference("pref_screen19");
			screenPref20 = (PreferenceScreen)findPreference("pref_screen20");
			screenPref21 = (PreferenceScreen)findPreference("pref_screen21");
			screenPref22 = (PreferenceScreen)findPreference("pref_screen22");
			screenPref23 = (PreferenceScreen)findPreference("pref_screen23");
			screenPref24 = (PreferenceScreen)findPreference("pref_screen24");
			screenPref25 = (PreferenceScreen)findPreference("pref_screen25");
			screenPref26 = (PreferenceScreen)findPreference("pref_screen26");
			screenPref27 = (PreferenceScreen)findPreference("pref_screen27");
			screenPref28 = (PreferenceScreen)findPreference("pref_screen28");
			screenPref29 = (PreferenceScreen)findPreference("pref_screen29");
			screenPref30 = (PreferenceScreen)findPreference("pref_screen30");
			screenPref31 = (PreferenceScreen)findPreference("pref_screen31");
			screenPref32 = (PreferenceScreen)findPreference("pref_screen32");
			screenPref33 = (PreferenceScreen)findPreference("pref_screen33");
			screenPref34 = (PreferenceScreen)findPreference("pref_screen34");
			screenPref35 = (PreferenceScreen)findPreference("pref_screen35");
			screenPref36 = (PreferenceScreen)findPreference("pref_screen36");
			screenPref37 = (PreferenceScreen)findPreference("pref_screen37");
			screenPref38 = (PreferenceScreen)findPreference("pref_screen38");
			screenPref39 = (PreferenceScreen)findPreference("pref_screen39");
			screenPref40 = (PreferenceScreen)findPreference("pref_screen40");

			//ダイヤル削除
			screenPref_del1 = (PreferenceScreen)findPreference("pref_screen_del1");
			screenPref_del2 = (PreferenceScreen)findPreference("pref_screen_del2");
			screenPref_del3 = (PreferenceScreen)findPreference("pref_screen_del3");
			screenPref_del4 = (PreferenceScreen)findPreference("pref_screen_del4");
			screenPref_del5 = (PreferenceScreen)findPreference("pref_screen_del5");
			screenPref_del6 = (PreferenceScreen)findPreference("pref_screen_del6");
			screenPref_del7 = (PreferenceScreen)findPreference("pref_screen_del7");
			screenPref_del8 = (PreferenceScreen)findPreference("pref_screen_del8");
			screenPref_del9 = (PreferenceScreen)findPreference("pref_screen_del9");
			screenPref_del10 = (PreferenceScreen)findPreference("pref_screen_del10");
			screenPref_del11 = (PreferenceScreen)findPreference("pref_screen_del11");
			screenPref_del12 = (PreferenceScreen)findPreference("pref_screen_del12");
			screenPref_del13 = (PreferenceScreen)findPreference("pref_screen_del13");
			screenPref_del14 = (PreferenceScreen)findPreference("pref_screen_del14");
			screenPref_del15 = (PreferenceScreen)findPreference("pref_screen_del15");
			screenPref_del16 = (PreferenceScreen)findPreference("pref_screen_del16");
			screenPref_del17 = (PreferenceScreen)findPreference("pref_screen_del17");
			screenPref_del18 = (PreferenceScreen)findPreference("pref_screen_del18");
			screenPref_del19 = (PreferenceScreen)findPreference("pref_screen_del19");
			screenPref_del20 = (PreferenceScreen)findPreference("pref_screen_del20");
			screenPref_del21 = (PreferenceScreen)findPreference("pref_screen_del21");
			screenPref_del22 = (PreferenceScreen)findPreference("pref_screen_del22");
			screenPref_del23 = (PreferenceScreen)findPreference("pref_screen_del23");
			screenPref_del24 = (PreferenceScreen)findPreference("pref_screen_del24");
			screenPref_del25 = (PreferenceScreen)findPreference("pref_screen_del25");
			screenPref_del26 = (PreferenceScreen)findPreference("pref_screen_del26");
			screenPref_del27 = (PreferenceScreen)findPreference("pref_screen_del27");
			screenPref_del28 = (PreferenceScreen)findPreference("pref_screen_del28");
			screenPref_del29 = (PreferenceScreen)findPreference("pref_screen_del29");
			screenPref_del30 = (PreferenceScreen)findPreference("pref_screen_del30");
			screenPref_del31 = (PreferenceScreen)findPreference("pref_screen_del31");
			screenPref_del32 = (PreferenceScreen)findPreference("pref_screen_del32");
			screenPref_del33 = (PreferenceScreen)findPreference("pref_screen_del33");
			screenPref_del34 = (PreferenceScreen)findPreference("pref_screen_del34");
			screenPref_del35 = (PreferenceScreen)findPreference("pref_screen_del35");
			screenPref_del36 = (PreferenceScreen)findPreference("pref_screen_del36");
			screenPref_del37 = (PreferenceScreen)findPreference("pref_screen_del37");
			screenPref_del38 = (PreferenceScreen)findPreference("pref_screen_del38");
			screenPref_del39 = (PreferenceScreen)findPreference("pref_screen_del39");
			screenPref_del40 = (PreferenceScreen)findPreference("pref_screen_del40");

			//動作設定
			((ListPreference)listDialOrCall).setSummary(Quickdial.sp.getString("action_sumary", getString(R.string.list_summary_dorc)));
			((ListPreference)listListHeight).setSummary(Quickdial.sp.getString("listheight_sumary", getString(R.string.list_summary_listheight)));
			((ListPreference)listCharSize).setSummary(Quickdial.sp.getString("charsize_sumary", getString(R.string.list_summary_charsize)));
			((ListPreference)listTheme).setSummary(Quickdial.sp.getString("theme_sumary", getString(R.string.list_summary_theme)));

			((EditTextPreference)editTextTab1).setSummary(Quickdial.sp.getString("group_name1", getString(R.string.tab_name_summary)));
			((EditTextPreference)editTextTab2).setSummary(Quickdial.sp.getString("group_name2", getString(R.string.tab_name_summary)));
			((EditTextPreference)editTextTab3).setSummary(Quickdial.sp.getString("group_name3", getString(R.string.tab_name_summary)));
			((EditTextPreference)editTextTab4).setSummary(Quickdial.sp.getString("group_name4", getString(R.string.tab_name_summary)));
			((EditTextPreference)editTextTab5).setSummary(Quickdial.sp.getString("group_name5", getString(R.string.tab_name_summary)));

			((PreferenceScreen)screenPrefDialRoot1).setSummary(Quickdial.sp.getString("dial_name1", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number1", ""));
			((PreferenceScreen)screenPrefDialRoot2).setSummary(Quickdial.sp.getString("dial_name2", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number2", ""));
			((PreferenceScreen)screenPrefDialRoot3).setSummary(Quickdial.sp.getString("dial_name3", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number3", ""));
			((PreferenceScreen)screenPrefDialRoot4).setSummary(Quickdial.sp.getString("dial_name4", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number4", ""));
			((PreferenceScreen)screenPrefDialRoot5).setSummary(Quickdial.sp.getString("dial_name5", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number5", ""));
			((PreferenceScreen)screenPrefDialRoot6).setSummary(Quickdial.sp.getString("dial_name6", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number6", ""));
			((PreferenceScreen)screenPrefDialRoot7).setSummary(Quickdial.sp.getString("dial_name7", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number7", ""));
			((PreferenceScreen)screenPrefDialRoot8).setSummary(Quickdial.sp.getString("dial_name8", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number8", ""));
			((PreferenceScreen)screenPrefDialRoot9).setSummary(Quickdial.sp.getString("dial_name9", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number9", ""));
			((PreferenceScreen)screenPrefDialRoot10).setSummary(Quickdial.sp.getString("dial_name10", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number10", ""));
			((PreferenceScreen)screenPrefDialRoot11).setSummary(Quickdial.sp.getString("dial_name11", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number11", ""));
			((PreferenceScreen)screenPrefDialRoot12).setSummary(Quickdial.sp.getString("dial_name12", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number12", ""));
			((PreferenceScreen)screenPrefDialRoot13).setSummary(Quickdial.sp.getString("dial_name13", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number13", ""));
			((PreferenceScreen)screenPrefDialRoot14).setSummary(Quickdial.sp.getString("dial_name14", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number14", ""));
			((PreferenceScreen)screenPrefDialRoot15).setSummary(Quickdial.sp.getString("dial_name15", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number15", ""));
			((PreferenceScreen)screenPrefDialRoot16).setSummary(Quickdial.sp.getString("dial_name16", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number16", ""));
			((PreferenceScreen)screenPrefDialRoot17).setSummary(Quickdial.sp.getString("dial_name17", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number17", ""));
			((PreferenceScreen)screenPrefDialRoot18).setSummary(Quickdial.sp.getString("dial_name18", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number18", ""));
			((PreferenceScreen)screenPrefDialRoot19).setSummary(Quickdial.sp.getString("dial_name19", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number19", ""));
			((PreferenceScreen)screenPrefDialRoot20).setSummary(Quickdial.sp.getString("dial_name20", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number20", ""));
			((PreferenceScreen)screenPrefDialRoot21).setSummary(Quickdial.sp.getString("dial_name21", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number21", ""));
			((PreferenceScreen)screenPrefDialRoot22).setSummary(Quickdial.sp.getString("dial_name22", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number22", ""));
			((PreferenceScreen)screenPrefDialRoot23).setSummary(Quickdial.sp.getString("dial_name23", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number23", ""));
			((PreferenceScreen)screenPrefDialRoot24).setSummary(Quickdial.sp.getString("dial_name24", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number24", ""));
			((PreferenceScreen)screenPrefDialRoot25).setSummary(Quickdial.sp.getString("dial_name25", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number25", ""));
			((PreferenceScreen)screenPrefDialRoot26).setSummary(Quickdial.sp.getString("dial_name26", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number26", ""));
			((PreferenceScreen)screenPrefDialRoot27).setSummary(Quickdial.sp.getString("dial_name27", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number27", ""));
			((PreferenceScreen)screenPrefDialRoot28).setSummary(Quickdial.sp.getString("dial_name28", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number28", ""));
			((PreferenceScreen)screenPrefDialRoot29).setSummary(Quickdial.sp.getString("dial_name29", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number29", ""));
			((PreferenceScreen)screenPrefDialRoot30).setSummary(Quickdial.sp.getString("dial_name30", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number30", ""));
			((PreferenceScreen)screenPrefDialRoot31).setSummary(Quickdial.sp.getString("dial_name31", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number31", ""));
			((PreferenceScreen)screenPrefDialRoot32).setSummary(Quickdial.sp.getString("dial_name32", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number32", ""));
			((PreferenceScreen)screenPrefDialRoot33).setSummary(Quickdial.sp.getString("dial_name33", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number33", ""));
			((PreferenceScreen)screenPrefDialRoot34).setSummary(Quickdial.sp.getString("dial_name34", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number34", ""));
			((PreferenceScreen)screenPrefDialRoot35).setSummary(Quickdial.sp.getString("dial_name35", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number35", ""));
			((PreferenceScreen)screenPrefDialRoot36).setSummary(Quickdial.sp.getString("dial_name36", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number36", ""));
			((PreferenceScreen)screenPrefDialRoot37).setSummary(Quickdial.sp.getString("dial_name37", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number37", ""));
			((PreferenceScreen)screenPrefDialRoot38).setSummary(Quickdial.sp.getString("dial_name38", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number38", ""));
			((PreferenceScreen)screenPrefDialRoot39).setSummary(Quickdial.sp.getString("dial_name39", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number39", ""));
			((PreferenceScreen)screenPrefDialRoot40).setSummary(Quickdial.sp.getString("dial_name40", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number40", ""));

			//ダイヤル登録
			((PreferenceScreen)screenPref1).setSummary(Quickdial.sp.getString("dial_name1", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number1", ""));
			((PreferenceScreen)screenPref2).setSummary(Quickdial.sp.getString("dial_name2", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number2", ""));
			((PreferenceScreen)screenPref3).setSummary(Quickdial.sp.getString("dial_name3", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number3", ""));
			((PreferenceScreen)screenPref4).setSummary(Quickdial.sp.getString("dial_name4", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number4", ""));
			((PreferenceScreen)screenPref5).setSummary(Quickdial.sp.getString("dial_name5", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number5", ""));
			((PreferenceScreen)screenPref6).setSummary(Quickdial.sp.getString("dial_name6", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number6", ""));
			((PreferenceScreen)screenPref7).setSummary(Quickdial.sp.getString("dial_name7", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number7", ""));
			((PreferenceScreen)screenPref8).setSummary(Quickdial.sp.getString("dial_name8", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number8", ""));
			((PreferenceScreen)screenPref9).setSummary(Quickdial.sp.getString("dial_name9", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number9", ""));
			((PreferenceScreen)screenPref10).setSummary(Quickdial.sp.getString("dial_name10", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number10", ""));
			((PreferenceScreen)screenPref11).setSummary(Quickdial.sp.getString("dial_name11", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number11", ""));
			((PreferenceScreen)screenPref12).setSummary(Quickdial.sp.getString("dial_name12", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number12", ""));
			((PreferenceScreen)screenPref13).setSummary(Quickdial.sp.getString("dial_name13", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number13", ""));
			((PreferenceScreen)screenPref14).setSummary(Quickdial.sp.getString("dial_name14", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number14", ""));
			((PreferenceScreen)screenPref15).setSummary(Quickdial.sp.getString("dial_name15", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number15", ""));
			((PreferenceScreen)screenPref16).setSummary(Quickdial.sp.getString("dial_name16", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number16", ""));
			((PreferenceScreen)screenPref17).setSummary(Quickdial.sp.getString("dial_name17", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number17", ""));
			((PreferenceScreen)screenPref18).setSummary(Quickdial.sp.getString("dial_name18", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number18", ""));
			((PreferenceScreen)screenPref19).setSummary(Quickdial.sp.getString("dial_name19", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number19", ""));
			((PreferenceScreen)screenPref20).setSummary(Quickdial.sp.getString("dial_name20", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number20", ""));
			((PreferenceScreen)screenPref21).setSummary(Quickdial.sp.getString("dial_name21", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number21", ""));
			((PreferenceScreen)screenPref22).setSummary(Quickdial.sp.getString("dial_name22", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number22", ""));
			((PreferenceScreen)screenPref23).setSummary(Quickdial.sp.getString("dial_name23", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number23", ""));
			((PreferenceScreen)screenPref24).setSummary(Quickdial.sp.getString("dial_name24", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number24", ""));
			((PreferenceScreen)screenPref25).setSummary(Quickdial.sp.getString("dial_name25", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number25", ""));
			((PreferenceScreen)screenPref26).setSummary(Quickdial.sp.getString("dial_name26", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number26", ""));
			((PreferenceScreen)screenPref27).setSummary(Quickdial.sp.getString("dial_name27", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number27", ""));
			((PreferenceScreen)screenPref28).setSummary(Quickdial.sp.getString("dial_name28", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number28", ""));
			((PreferenceScreen)screenPref29).setSummary(Quickdial.sp.getString("dial_name29", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number29", ""));
			((PreferenceScreen)screenPref30).setSummary(Quickdial.sp.getString("dial_name30", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number30", ""));
			((PreferenceScreen)screenPref31).setSummary(Quickdial.sp.getString("dial_name31", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number31", ""));
			((PreferenceScreen)screenPref32).setSummary(Quickdial.sp.getString("dial_name32", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number32", ""));
			((PreferenceScreen)screenPref33).setSummary(Quickdial.sp.getString("dial_name33", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number33", ""));
			((PreferenceScreen)screenPref34).setSummary(Quickdial.sp.getString("dial_name34", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number34", ""));
			((PreferenceScreen)screenPref35).setSummary(Quickdial.sp.getString("dial_name35", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number35", ""));
			((PreferenceScreen)screenPref36).setSummary(Quickdial.sp.getString("dial_name36", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number36", ""));
			((PreferenceScreen)screenPref37).setSummary(Quickdial.sp.getString("dial_name37", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number37", ""));
			((PreferenceScreen)screenPref38).setSummary(Quickdial.sp.getString("dial_name38", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number38", ""));
			((PreferenceScreen)screenPref39).setSummary(Quickdial.sp.getString("dial_name39", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number39", ""));
			((PreferenceScreen)screenPref40).setSummary(Quickdial.sp.getString("dial_name40", getString(R.string.txt_no_reg)) + ":" + Quickdial.sp.getString("dial_number40", ""));

			//動作設定
			listDialOrCall.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
				@Override
				public boolean onPreferenceChange(Preference preference, Object newValue) {

					try {
						String summary = "";
						String value = "";
						String[] entries = getResources().getStringArray(R.array.list_dorc);
						String[] values = getResources().getStringArray(R.array.list_dorcvalues);
						for (int i = 0; i < values.length; ++i) {
							if (values[i].equals(newValue)) {
								summary = entries[i];
								value = values[i];
								break;
							}
						}
						((ListPreference)preference).setSummary(summary);
						Editor editor = Quickdial.sp.edit();
						editor.putString("action_value",value);
						editor.putString("action_sumary",summary);
						editor.commit();


						return true;
					} catch (NotFoundException e) {

						return false;
					}
				}
			});

			//動作設定
			listListHeight.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
				@Override
				public boolean onPreferenceChange(Preference preference, Object newValue) {

					try {
						String summary = "";
						String value = "";
						String[] entries = getResources().getStringArray(R.array.list_height);
						String[] values = getResources().getStringArray(R.array.list_heightvalues);
						for (int i = 0; i < values.length; ++i) {
							if (values[i].equals(newValue)) {
								summary = entries[i];
								value = values[i];
								break;
							}
						}
						((ListPreference)preference).setSummary(summary);
						Editor editor = Quickdial.sp.edit();
						editor.putString("listheight_value",value);
						editor.putString("listheight_sumary",summary);
						editor.commit();


						return true;
					} catch (NotFoundException e) {

						return false;
					}
				}
			});

			//動作設定
			listCharSize.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
				@Override
				public boolean onPreferenceChange(Preference preference, Object newValue) {

					try {
						String summary = "";
						String value = "";
						String[] entries = getResources().getStringArray(R.array.list_charsize);
						String[] values = getResources().getStringArray(R.array.list_charsizevalues);
						for (int i = 0; i < values.length; ++i) {
							if (values[i].equals(newValue)) {
								summary = entries[i];
								value = values[i];
								break;
							}
						}
						((ListPreference)preference).setSummary(summary);
						Editor editor = Quickdial.sp.edit();
						editor.putString("charsize_value",value);
						editor.putString("charsize_sumary",summary);
						editor.commit();


						return true;
					} catch (NotFoundException e) {

						return false;
					}
				}
			});

			//背景色設定
			listTheme.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
				@Override
				public boolean onPreferenceChange(Preference preference, Object newValue) {

					try {
						String summary = "";
						String value = "";
						String[] entries = getResources().getStringArray(R.array.list_theme);
						String[] values = getResources().getStringArray(R.array.list_themevalues);
						for (int i = 0; i < values.length; ++i) {
							if (values[i].equals(newValue)) {
								summary = entries[i];
								value = values[i];
								break;
							}
						}
						((ListPreference)preference).setSummary(summary);
						Editor editor = Quickdial.sp.edit();
						editor.putString("theme_value",value);
						editor.putString("theme_sumary",summary);
						editor.commit();

						return true;
					} catch (NotFoundException e) {

						return false;
					}
				}

			});

			//Group名設定
			editTextTab1.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
				@Override
				public boolean onPreferenceChange(Preference preference, Object newValue) {
					try {
						((EditTextPreference)preference).setSummary(newValue.toString());
						Editor editor = Quickdial.sp.edit();
						editor.putString("group_name1",newValue.toString());
						editor.commit();

						return true;
					} catch (Exception e) {

						return false;
					}
				}
			});
			editTextTab2.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
				@Override
				public boolean onPreferenceChange(Preference preference, Object newValue) {
					try {
						((EditTextPreference)preference).setSummary(newValue.toString());
						Editor editor = Quickdial.sp.edit();
						editor.putString("group_name2",newValue.toString());
						editor.commit();
						return true;
					} catch (Exception e) {

						return false;
					}
				}
			});
			editTextTab3.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
				@Override
				public boolean onPreferenceChange(Preference preference, Object newValue) {
					try {
						((EditTextPreference)preference).setSummary(newValue.toString());
						Editor editor = Quickdial.sp.edit();
						editor.putString("group_name3",newValue.toString());
						editor.commit();
						return true;
					} catch (Exception e) {

						return false;
					}
				}
			});
			editTextTab4.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
				@Override
				public boolean onPreferenceChange(Preference preference, Object newValue) {
					try {
						((EditTextPreference)preference).setSummary(newValue.toString());
						Editor editor = Quickdial.sp.edit();
						editor.putString("group_name4",newValue.toString());
						editor.commit();
						return true;
					} catch (Exception e) {

						return false;
					}
				}
			});
			editTextTab5.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
				@Override
				public boolean onPreferenceChange(Preference preference, Object newValue) {
					try {
						((EditTextPreference)preference).setSummary(newValue.toString());
						Editor editor = Quickdial.sp.edit();
						editor.putString("group_name5",newValue.toString());
						editor.commit();
						return true;
					} catch (Exception e) {

						return false;
					}
				}
			});

			//ダイヤル登録
			screenPref1.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Intent intent;
						intent = com_screenPref_onClick();
						startActivityForResult(intent, REQUEST_PICK_CONTACT1);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref2.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Intent intent;
						intent = com_screenPref_onClick();
						startActivityForResult(intent, REQUEST_PICK_CONTACT2);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref3.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Intent intent;
						intent = com_screenPref_onClick();
						startActivityForResult(intent, REQUEST_PICK_CONTACT3);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref4.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Intent intent;
						intent = com_screenPref_onClick();
						startActivityForResult(intent, REQUEST_PICK_CONTACT4);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref5.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();
						startActivityForResult(intent, REQUEST_PICK_CONTACT5);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref6.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT6);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref7.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT7);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref8.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT8);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref9.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT9);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref10.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT10);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			//ダイヤル登録
			screenPref11.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT11);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref12.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT12);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref13.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT13);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref14.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT14);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref15.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT15);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref16.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT16);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref17.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT17);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref18.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT18);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref19.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT19);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref20.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT20);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			//ダイヤル登録
			screenPref21.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT21);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref22.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT22);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref23.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT23);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref24.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT24);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref25.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT25);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref26.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT26);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref27.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT27);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref28.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT28);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref29.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT29);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref30.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT30);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			//ダイヤル登録
			screenPref31.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT31);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref32.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT32);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref33.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT33);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref34.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT34);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref35.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT35);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref36.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT36);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref37.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT37);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref38.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT38);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref39.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT39);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref40.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    @Override
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Intent intent;
						intent = com_screenPref_onClick();

						startActivityForResult(intent, REQUEST_PICK_CONTACT40);
						showProgressDlg();
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});

			//ダイヤル削除
			screenPref_del1.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name1");
						editor.remove("dial_number1");
						editor.commit();
						((PreferenceScreen)screenPref1).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot1).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del2.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name2");
						editor.remove("dial_number2");
						editor.commit();
						((PreferenceScreen)screenPref2).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot2).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del3.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name3");
						editor.remove("dial_number3");
						editor.commit();
						((PreferenceScreen)screenPref3).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot3).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del4.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name4");
						editor.remove("dial_number4");
						editor.commit();
						((PreferenceScreen)screenPref4).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot4).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del5.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name5");
						editor.remove("dial_number5");
						editor.commit();
						((PreferenceScreen)screenPref5).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot5).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del6.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name6");
						editor.remove("dial_number6");
						editor.commit();
						((PreferenceScreen)screenPref6).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot6).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del7.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name7");
						editor.remove("dial_number7");
						editor.commit();
						((PreferenceScreen)screenPref7).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot7).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del8.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name8");
						editor.remove("dial_number8");
						editor.commit();
						((PreferenceScreen)screenPref8).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot8).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del9.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {

			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name9");
						editor.remove("dial_number9");
						editor.commit();
						((PreferenceScreen)screenPref9).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot9).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del10.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name10");
						editor.remove("dial_number10");
						editor.commit();
						((PreferenceScreen)screenPref10).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot10).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			//ダイヤル削除
			screenPref_del11.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name11");
						editor.remove("dial_number11");
						editor.commit();
						((PreferenceScreen)screenPref11).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot11).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del12.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name12");
						editor.remove("dial_number12");
						editor.commit();
						((PreferenceScreen)screenPref12).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot12).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del13.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name13");
						editor.remove("dial_number13");
						editor.commit();
						((PreferenceScreen)screenPref13).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot13).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del14.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name14");
						editor.remove("dial_number14");
						editor.commit();
						((PreferenceScreen)screenPref14).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot14).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del15.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name15");
						editor.remove("dial_number15");
						editor.commit();
						((PreferenceScreen)screenPref15).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot15).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del16.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name16");
						editor.remove("dial_number16");
						editor.commit();
						((PreferenceScreen)screenPref16).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot16).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del17.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name17");
						editor.remove("dial_number17");
						editor.commit();
						((PreferenceScreen)screenPref17).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot17).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del18.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name18");
						editor.remove("dial_number18");
						editor.commit();
						((PreferenceScreen)screenPref18).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot18).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {
						return false;
					}
			    }
			});
			screenPref_del19.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name19");
						editor.remove("dial_number19");
						editor.commit();
						((PreferenceScreen)screenPref19).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot19).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del20.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name20");
						editor.remove("dial_number20");
						editor.commit();
						((PreferenceScreen)screenPref20).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot20).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			//ダイヤル削除
			screenPref_del21.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name21");
						editor.remove("dial_number21");
						editor.commit();
						((PreferenceScreen)screenPref21).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot21).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del22.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name22");
						editor.remove("dial_number22");
						editor.commit();
						((PreferenceScreen)screenPref22).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot22).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del23.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name23");
						editor.remove("dial_number23");
						editor.commit();
						((PreferenceScreen)screenPref23).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot23).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del24.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name24");
						editor.remove("dial_number24");
						editor.commit();
						((PreferenceScreen)screenPref24).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot24).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del25.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name25");
						editor.remove("dial_number25");
						editor.commit();
						((PreferenceScreen)screenPref25).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot25).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del26.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name26");
						editor.remove("dial_number26");
						editor.commit();
						((PreferenceScreen)screenPref26).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot26).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del27.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name27");
						editor.remove("dial_number27");
						editor.commit();
						((PreferenceScreen)screenPref27).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot27).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del28.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name28");
						editor.remove("dial_number28");
						editor.commit();
						((PreferenceScreen)screenPref28).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot28).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del29.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name29");
						editor.remove("dial_number29");
						editor.commit();
						((PreferenceScreen)screenPref29).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot29).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del30.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name30");
						editor.remove("dial_number30");
						editor.commit();
						((PreferenceScreen)screenPref30).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot30).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			//ダイヤル削除
			screenPref_del31.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name31");
						editor.remove("dial_number31");
						editor.commit();
						((PreferenceScreen)screenPref31).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot31).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del32.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name32");
						editor.remove("dial_number32");
						editor.commit();
						((PreferenceScreen)screenPref32).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot32).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del33.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name33");
						editor.remove("dial_number33");
						editor.commit();
						((PreferenceScreen)screenPref33).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot33).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del34.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name34");
						editor.remove("dial_number34");
						editor.commit();
						((PreferenceScreen)screenPref34).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot34).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del35.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name35");
						editor.remove("dial_number35");
						editor.commit();
						((PreferenceScreen)screenPref35).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot35).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del36.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name36");
						editor.remove("dial_number36");
						editor.commit();
						((PreferenceScreen)screenPref36).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot36).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del37.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name37");
						editor.remove("dial_number37");
						editor.commit();
						((PreferenceScreen)screenPref37).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot37).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del38.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name38");
						editor.remove("dial_number38");
						editor.commit();
						((PreferenceScreen)screenPref38).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot38).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del39.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name39");
						editor.remove("dial_number39");
						editor.commit();
						((PreferenceScreen)screenPref39).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot39).setSummary(getString(R.string.txt_no_reg));
						return true;
					} catch (Exception e) {

						return false;
					}
			    }
			});
			screenPref_del40.setOnPreferenceClickListener(new OnPreferenceClickListener(){
			    public boolean onPreferenceClick(Preference preference) {
			    	try {
						Editor editor = Quickdial.sp.edit();
						editor.remove("dial_name40");
						editor.remove("dial_number40");
						editor.commit();
						((PreferenceScreen)screenPref40).setSummary(getString(R.string.txt_no_reg));
						((PreferenceScreen)screenPrefDialRoot40).setSummary(getString(R.string.txt_no_reg));

						return true;

			    	} catch (Exception e) {
						return false;
					}
			    }
			});
		} catch (Exception e) {
			return;
		}

    }

    @Override
    public void onResume() {
        super.onResume();
        reloadSummary();
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(listener);
    }

    @Override
    public void onPause() {
        super.onPause();
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(listener);
    }

    private void reloadSummary(){
        ListAdapter adapter = getPreferenceScreen().getRootAdapter();
        for (int i=0;i<adapter.getCount();i++){
            Object item = adapter.getItem(i);
            if (item instanceof ListPreference){
                ListPreference preference = (ListPreference) item;
                preference.setSummary(preference.getEntry() == null ? "" : preference.getEntry());
            }
        }
    }

    private SharedPreferences.OnSharedPreferenceChangeListener listener =
            new SharedPreferences.OnSharedPreferenceChangeListener() {
                public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
                    reloadSummary();
                }
            };


    //ダイヤル登録（共通動作）
	private Intent com_screenPref_onClick(){
		try {
			Intent intent;
			int sdkVersion = Integer.parseInt(Build.VERSION.SDK);
			if (sdkVersion < Build.VERSION_CODES.ECLAIR) {
				intent = new Intent(Intent.ACTION_PICK, Uri.parse("content://contacts/phones"));
			}else{
				intent = new Intent(Intent.ACTION_PICK, Uri.parse("content://com.android.contacts/data/phones"));
			}

			return intent;

		} catch (NumberFormatException e) {
			return null;
		}
	}

	//ダイヤル登録（電話帳戻り）
    @Override
	public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);

        try {

        	Editor editor;

			if (resultCode == Activity.RESULT_OK) {

				Uri uri = intent.getData();
				//Cursor personCursor = getActivity().getContentResolver().query(uri, null, null, null, null);
				Cursor personCursor = managedQuery(uri, null, null, null, null);
				if (personCursor.moveToFirst()) {

					int nameIndex;
					int numberIndex;

					int sdkVersion = Integer.parseInt(Build.VERSION.SDK);
			        if (sdkVersion < Build.VERSION_CODES.ECLAIR) {
						 nameIndex = personCursor.getColumnIndexOrThrow("name");
						 numberIndex = personCursor.getColumnIndexOrThrow("number");
			        }else{
						 nameIndex = personCursor.getColumnIndexOrThrow("display_name");
						 numberIndex = personCursor.getColumnIndexOrThrow("data1");
			        }

					String name = personCursor.getString(nameIndex);
					String number = personCursor.getString(numberIndex);

					editor = Quickdial.sp.edit();

					if (requestCode == REQUEST_PICK_CONTACT1){
						((PreferenceScreen)screenPref1).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot1).setSummary(name + ":" + number);
						editor.putString("dial_name1",name);
						editor.putString("dial_number1",number);
					}else if (requestCode == REQUEST_PICK_CONTACT2){
						((PreferenceScreen)screenPref2).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot2).setSummary(name + ":" + number);
						editor.putString("dial_name2",name);
						editor.putString("dial_number2",number);
					}else if (requestCode == REQUEST_PICK_CONTACT3){
						((PreferenceScreen)screenPref3).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot3).setSummary(name + ":" + number);
						editor.putString("dial_name3",name);
						editor.putString("dial_number3",number);
					}else if (requestCode == REQUEST_PICK_CONTACT4){
						((PreferenceScreen)screenPref4).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot4).setSummary(name + ":" + number);
						editor.putString("dial_name4",name);
						editor.putString("dial_number4",number);
					}else if (requestCode == REQUEST_PICK_CONTACT5){
						((PreferenceScreen)screenPref5).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot5).setSummary(name + ":" + number);
						editor.putString("dial_name5",name);
						editor.putString("dial_number5",number);
					}else if (requestCode == REQUEST_PICK_CONTACT6){
						((PreferenceScreen)screenPref6).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot6).setSummary(name + ":" + number);
						editor.putString("dial_name6",name);
						editor.putString("dial_number6",number);
					}else if (requestCode == REQUEST_PICK_CONTACT7){
						((PreferenceScreen)screenPref7).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot7).setSummary(name + ":" + number);
						editor.putString("dial_name7",name);
						editor.putString("dial_number7",number);
					}else if (requestCode == REQUEST_PICK_CONTACT8){
						((PreferenceScreen)screenPref8).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot8).setSummary(name + ":" + number);
						editor.putString("dial_name8",name);
						editor.putString("dial_number8",number);
					}else if (requestCode == REQUEST_PICK_CONTACT9){
						((PreferenceScreen)screenPref9).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot9).setSummary(name + ":" + number);
						editor.putString("dial_name9",name);
						editor.putString("dial_number9",number);
					}else if (requestCode == REQUEST_PICK_CONTACT10){
						((PreferenceScreen)screenPref10).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot10).setSummary(name + ":" + number);
						editor.putString("dial_name10",name);
						editor.putString("dial_number10",number);
					}else if (requestCode == REQUEST_PICK_CONTACT11){
						((PreferenceScreen)screenPref11).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot11).setSummary(name + ":" + number);
						editor.putString("dial_name11",name);
						editor.putString("dial_number11",number);
					}else if (requestCode == REQUEST_PICK_CONTACT12){
						((PreferenceScreen)screenPref12).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot12).setSummary(name + ":" + number);
						editor.putString("dial_name12",name);
						editor.putString("dial_number12",number);
					}else if (requestCode == REQUEST_PICK_CONTACT13){
						((PreferenceScreen)screenPref13).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot13).setSummary(name + ":" + number);
						editor.putString("dial_name13",name);
						editor.putString("dial_number13",number);
					}else if (requestCode == REQUEST_PICK_CONTACT14){
						((PreferenceScreen)screenPref14).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot14).setSummary(name + ":" + number);
						editor.putString("dial_name14",name);
						editor.putString("dial_number14",number);
					}else if (requestCode == REQUEST_PICK_CONTACT15){
						((PreferenceScreen)screenPref15).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot15).setSummary(name + ":" + number);
						editor.putString("dial_name15",name);
						editor.putString("dial_number15",number);
					}else if (requestCode == REQUEST_PICK_CONTACT16){
						((PreferenceScreen)screenPref16).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot16).setSummary(name + ":" + number);
						editor.putString("dial_name16",name);
						editor.putString("dial_number16",number);
					}else if (requestCode == REQUEST_PICK_CONTACT17){
						((PreferenceScreen)screenPref17).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot17).setSummary(name + ":" + number);
						editor.putString("dial_name17",name);
						editor.putString("dial_number17",number);
					}else if (requestCode == REQUEST_PICK_CONTACT18){
						((PreferenceScreen)screenPref18).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot18).setSummary(name + ":" + number);
						editor.putString("dial_name18",name);
						editor.putString("dial_number18",number);
					}else if (requestCode == REQUEST_PICK_CONTACT19){
						((PreferenceScreen)screenPref19).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot19).setSummary(name + ":" + number);
						editor.putString("dial_name19",name);
						editor.putString("dial_number19",number);
					}else if (requestCode == REQUEST_PICK_CONTACT20){
						((PreferenceScreen)screenPref20).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot20).setSummary(name + ":" + number);
						editor.putString("dial_name20",name);
						editor.putString("dial_number20",number);
					}else if (requestCode == REQUEST_PICK_CONTACT21){
						((PreferenceScreen)screenPref21).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot21).setSummary(name + ":" + number);
						editor.putString("dial_name21",name);
						editor.putString("dial_number21",number);
					}else if (requestCode == REQUEST_PICK_CONTACT22){
						((PreferenceScreen)screenPref22).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot22).setSummary(name + ":" + number);
						editor.putString("dial_name22",name);
						editor.putString("dial_number22",number);
					}else if (requestCode == REQUEST_PICK_CONTACT23){
						((PreferenceScreen)screenPref23).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot23).setSummary(name + ":" + number);
						editor.putString("dial_name23",name);
						editor.putString("dial_number23",number);
					}else if (requestCode == REQUEST_PICK_CONTACT24){
						((PreferenceScreen)screenPref24).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot24).setSummary(name + ":" + number);
						editor.putString("dial_name24",name);
						editor.putString("dial_number24",number);
					}else if (requestCode == REQUEST_PICK_CONTACT25){
						((PreferenceScreen)screenPref25).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot25).setSummary(name + ":" + number);
						editor.putString("dial_name25",name);
						editor.putString("dial_number25",number);
					}else if (requestCode == REQUEST_PICK_CONTACT26){
						((PreferenceScreen)screenPref26).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot26).setSummary(name + ":" + number);
						editor.putString("dial_name26",name);
						editor.putString("dial_number26",number);
					}else if (requestCode == REQUEST_PICK_CONTACT27){
						((PreferenceScreen)screenPref27).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot27).setSummary(name + ":" + number);
						editor.putString("dial_name27",name);
						editor.putString("dial_number27",number);
					}else if (requestCode == REQUEST_PICK_CONTACT28){
						((PreferenceScreen)screenPref28).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot28).setSummary(name + ":" + number);
						editor.putString("dial_name28",name);
						editor.putString("dial_number28",number);
					}else if (requestCode == REQUEST_PICK_CONTACT29){
						((PreferenceScreen)screenPref29).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot29).setSummary(name + ":" + number);
						editor.putString("dial_name29",name);
						editor.putString("dial_number29",number);
					}else if (requestCode == REQUEST_PICK_CONTACT30){
						((PreferenceScreen)screenPref30).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot30).setSummary(name + ":" + number);
						editor.putString("dial_name30",name);
						editor.putString("dial_number30",number);
					}else if (requestCode == REQUEST_PICK_CONTACT31){
						((PreferenceScreen)screenPref31).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot31).setSummary(name + ":" + number);
						editor.putString("dial_name31",name);
						editor.putString("dial_number31",number);
					}else if (requestCode == REQUEST_PICK_CONTACT32){
						((PreferenceScreen)screenPref32).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot32).setSummary(name + ":" + number);
						editor.putString("dial_name32",name);
						editor.putString("dial_number32",number);
					}else if (requestCode == REQUEST_PICK_CONTACT33){
						((PreferenceScreen)screenPref33).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot33).setSummary(name + ":" + number);
						editor.putString("dial_name33",name);
						editor.putString("dial_number33",number);
					}else if (requestCode == REQUEST_PICK_CONTACT34){
						((PreferenceScreen)screenPref34).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot34).setSummary(name + ":" + number);
						editor.putString("dial_name34",name);
						editor.putString("dial_number34",number);
					}else if (requestCode == REQUEST_PICK_CONTACT35){
						((PreferenceScreen)screenPref35).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot35).setSummary(name + ":" + number);
						editor.putString("dial_name35",name);
						editor.putString("dial_number35",number);
					}else if (requestCode == REQUEST_PICK_CONTACT36){
						((PreferenceScreen)screenPref36).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot36).setSummary(name + ":" + number);
						editor.putString("dial_name36",name);
						editor.putString("dial_number36",number);
					}else if (requestCode == REQUEST_PICK_CONTACT37){
						((PreferenceScreen)screenPref7).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot37).setSummary(name + ":" + number);
						editor.putString("dial_name37",name);
						editor.putString("dial_number37",number);
					}else if (requestCode == REQUEST_PICK_CONTACT38){
						((PreferenceScreen)screenPref38).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot38).setSummary(name + ":" + number);
						editor.putString("dial_name38",name);
						editor.putString("dial_number38",number);
					}else if (requestCode == REQUEST_PICK_CONTACT39){
						((PreferenceScreen)screenPref39).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot39).setSummary(name + ":" + number);
						editor.putString("dial_name39",name);
						editor.putString("dial_number39",number);
					}else if (requestCode == REQUEST_PICK_CONTACT40){
						((PreferenceScreen)screenPref40).setSummary(name + ":" + number);
						((PreferenceScreen)screenPrefDialRoot40).setSummary(name + ":" + number);
						editor.putString("dial_name40",name);
						editor.putString("dial_number40",number);
					}

					editor.commit();
				}
			}

			progressDialog.dismiss();

			return;

		} catch (Exception e) {
			return;
		}
    }

    private boolean screenPrefDialRoot_OnPreferenceClick(Preference preference){

    		try {
			PreferenceScreen screenPref = (PreferenceScreen) preference;
			//子画面オブジェクトを取得する
			Dialog d = screenPref.getDialog();
			//子画面のOnDismissListenerをハンドルする
			d.setOnDismissListener(new OnDismissListener(){
				@Override
			    public void onDismiss(DialogInterface dialog) {
			    	try {
						Dialog_OnDismiss(dialog);
					} catch (Exception e) {
						return;
					}
			    }});

			return true;

		} catch (Exception e) {

			return false;
		}
    }

    private void Dialog_OnDismiss(DialogInterface dialog){

        try {
			//再描画
			//ListView v = this.getListView();
        	ListView v = this.getListView();
			v.invalidateViews();
		} catch (Exception e) {
			return;
		}
    }

    public void showProgressDlg(){
        try {
			progressDialog = new ProgressDialog(this);
        	//progressDialog = new ProgressDialog(getActivity());
			//progressDialog.setTitle(R.string.dialogTitle);
			progressDialog.setMessage("Processing･･･");
			progressDialog.setIndeterminate(false);
			progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
			progressDialog.show();

		} catch (Exception e) {
			return;
		}
    }

}
