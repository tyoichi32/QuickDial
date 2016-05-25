package jp.saitama.muchan.quickdial;

import java.util.Locale;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Quickdial extends Activity implements ActionBar.TabListener {

	/**
	 * The {@link android.support.v4.view.PagerAdapter} that will provide
	 * fragments for each of the sections. We use a {@link FragmentPagerAdapter}
	 * derivative, which will keep every loaded fragment in memory. If this
	 * becomes too memory intensive, it may be best to switch to a
	 * {@link android.support.v13.app.FragmentStatePagerAdapter}.
	 */
	SectionsPagerAdapter mSectionsPagerAdapter;

	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	ViewPager mViewPager;

	public final static String SP_NAME = "quickdialsp";

    public static SharedPreferences sp;
    private final int MENU_SETTING = 0;

    private final String FLAG_ACTION_CALL = "call";

    private final String FLAG_THEME_LIGHT = "light";


    private final String LISTHEIGHT_DEFAULT = "0";
    private final String CHARSIZE_DEFAULT = "14.0f";

    private String bkTheme = null;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Quickdial.sp = getSharedPreferences(SP_NAME, MODE_WORLD_READABLE|MODE_WORLD_WRITEABLE);
		Quickdial.sp.edit().commit();

		String strTheme = sp.getString("theme_value", "");
		if (strTheme.equals(FLAG_THEME_LIGHT)){
			this.setTheme(android.R.style.Theme_Light);
		}else{
			this.setTheme(android.R.style.Theme_Black);
		}

		bkTheme = strTheme;

		// Set up the action bar.
		final ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		// Create the adapter that will return a fragment for each of the three
		// primary sections of the activity.
		mSectionsPagerAdapter = new SectionsPagerAdapter(getFragmentManager());

		// Set up the ViewPager with the sections adapter.
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);

		// When swiping between different sections, select the corresponding
		// tab. We can also use ActionBar.Tab#select() to do this if we have
		// a reference to the Tab.
		mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
			@Override
			public void onPageSelected(int position) {
				actionBar.setSelectedNavigationItem(position);
			}
		});

		// For each of the sections in the app, add a tab to the action bar.
		for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {
			// Create a tab with text corresponding to the page title defined by
			// the adapter. Also specify this Activity object, which implements
			// the TabListener interface, as the callback (listener) for when
			// this tab is selected.
			actionBar.addTab(actionBar.newTab().setText(mSectionsPagerAdapter.getPageTitle(i)).setTabListener(this));
		}
	}

    @Override
    public void onResume(){
        try {

			super.onResume();

			String strTheme = sp.getString("theme_value", "");
			if (!strTheme.equals(bkTheme)){
				Toast.makeText(this, getString(R.string.txt_chg_theme), Toast.LENGTH_SHORT).show();
			}
			bkTheme = strTheme;

			final ActionBar actionBar = getActionBar();
			actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);



			// For each of the sections in the app, add a tab to the action bar.
			for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {
				// Create a tab with text corresponding to the page title defined by
				// the adapter. Also specify this Activity object, which implements
				// the TabListener interface, as the callback (listener) for when
				// this tab is selected.
				actionBar.addTab(actionBar.newTab().setText(mSectionsPagerAdapter.getPageTitle(i)).setTabListener(this));
			}


			 //広告表示



        } catch (NumberFormatException e) {
			return;
		}
    }


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;


	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.

		int id = item.getItemId();
		if (id == R.id.action_settings) {

			Toast.makeText(this, R.string.action_settings, Toast.LENGTH_SHORT).show();

			Intent intent = new Intent(this, Setting.class);
			startActivity(intent);

			return true;
		}
		return super.onOptionsItemSelected(item);

	}

	@Override
	public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
		// When the given tab is selected, switch to the corresponding page in
		// the ViewPager.
		mViewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
	}

	@Override
	public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
	}


	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the sections/tabs/pages.
	 */
	public class SectionsPagerAdapter extends FragmentPagerAdapter {

		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			// getItem is called to instantiate the fragment for the given page.
			// Return a PlaceholderFragment (defined as a static inner class
			// below).
			return PlaceholderFragment.newInstance(position + 1);
		}

		@Override
		public int getCount() {
			// Show 5 total pages.
			return 5;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			Locale l = Locale.getDefault();
			switch (position) {
			case 0:
				return sp.getString("group_name1", "Group-1");
			case 1:
				return sp.getString("group_name2", "Group-2");
			case 2:
				return sp.getString("group_name3", "Group-3");
			case 3:
				return sp.getString("group_name4", "Group-4");
			case 4:
				return sp.getString("group_name5", "Group-5");
			}
			return null;

		}


	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		private static final String ARG_SECTION_NUMBER = "section_number";
		private static final int ARG_SECTION_MAXLINE = 8;

	    private final String FLAG_ACTION_CALL = "call";

	    private final String FLAG_THEME_LIGHT = "light";

	    private String bkTheme = null;

		/**
		 * Returns a new instance of this fragment for the given section number.
		 */
		public static PlaceholderFragment newInstance(int sectionNumber) {
			PlaceholderFragment fragment = new PlaceholderFragment();
			Bundle args = new Bundle();
			args.putInt(ARG_SECTION_NUMBER, sectionNumber);
			fragment.setArguments(args);

			return fragment;
		}

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container, false);

			Quickdial qd = new Quickdial();

			String strTheme = sp.getString("theme_value", "");
			if (strTheme.equals(FLAG_THEME_LIGHT)){
				qd.setTheme(android.R.style.Theme_Light);
			}else{
				qd.setTheme(android.R.style.Theme_Black);
			}

			this.bkTheme = strTheme;

			TextView textView = null;

			//NOの表示
			int lineNo = 1;

			lineNo = (getArguments().getInt(ARG_SECTION_NUMBER)*ARG_SECTION_MAXLINE)-7;

			textView = (TextView) rootView.findViewById(R.id.line_no1);
			textView.setText(String.format("%1$02d", lineNo++));
			textView = (TextView) rootView.findViewById(R.id.line_no2);
			textView.setText(String.format("%1$02d", lineNo++));
			textView = (TextView) rootView.findViewById(R.id.line_no3);
			textView.setText(String.format("%1$02d", lineNo++));
			textView = (TextView) rootView.findViewById(R.id.line_no4);
			textView.setText(String.format("%1$02d", lineNo++));
			textView = (TextView) rootView.findViewById(R.id.line_no5);
			textView.setText(String.format("%1$02d", lineNo++));
			textView = (TextView) rootView.findViewById(R.id.line_no6);
			textView.setText(String.format("%1$02d", lineNo++));
			textView = (TextView) rootView.findViewById(R.id.line_no7);
			textView.setText(String.format("%1$02d", lineNo++));
			textView = (TextView) rootView.findViewById(R.id.line_no8);
			textView.setText(String.format("%1$02d", lineNo++));

			//イメージボタン
			ImageButton imageButton = null;
			imageButton = (ImageButton)rootView.findViewById(R.id.ImageButton01);
			imageButton.setImageResource(android.R.drawable.sym_action_call);

			imageButton = (ImageButton)rootView.findViewById(R.id.ImageButton02);
			imageButton.setImageResource(android.R.drawable.sym_action_call);

			imageButton = (ImageButton)rootView.findViewById(R.id.ImageButton03);
			imageButton.setImageResource(android.R.drawable.sym_action_call);

			imageButton = (ImageButton)rootView.findViewById(R.id.ImageButton04);
			imageButton.setImageResource(android.R.drawable.sym_action_call);

			imageButton = (ImageButton)rootView.findViewById(R.id.ImageButton05);
			imageButton.setImageResource(android.R.drawable.sym_action_call);

			imageButton = (ImageButton)rootView.findViewById(R.id.ImageButton06);
			imageButton.setImageResource(android.R.drawable.sym_action_call);

			imageButton = (ImageButton)rootView.findViewById(R.id.ImageButton07);
			imageButton.setImageResource(android.R.drawable.sym_action_call);

			imageButton = (ImageButton)rootView.findViewById(R.id.ImageButton08);
			imageButton.setImageResource(android.R.drawable.sym_action_call);

			return rootView;
		}

	    public void onClick(View v){

	    	try {

	    		int lineNo = (getArguments().getInt(ARG_SECTION_NUMBER)*ARG_SECTION_MAXLINE)-7;


				String strDialNo = "";

				if(v.getId() == R.id.ImageButton01){
					strDialNo = sp.getString("dial_number" + String.valueOf(lineNo), "");
				}
				if(v.getId() == R.id.ImageButton02){
					strDialNo = sp.getString("dial_number" + String.valueOf(lineNo+1), "");
				}
				if(v.getId() == R.id.ImageButton03){
					strDialNo = sp.getString("dial_number" + String.valueOf(lineNo+2), "");
				}
				if(v.getId() == R.id.ImageButton04){
					strDialNo = sp.getString("dial_number" + String.valueOf(lineNo+3), "");
				}
				if(v.getId() == R.id.ImageButton05){
					strDialNo = sp.getString("dial_number" + String.valueOf(lineNo+4), "");
				}
				if(v.getId() == R.id.ImageButton06){
					strDialNo = sp.getString("dial_number" + String.valueOf(lineNo+5), "");
				}
				if(v.getId() == R.id.ImageButton07){
					strDialNo = sp.getString("dial_number" + String.valueOf(lineNo+6), "");
				}
				if(v.getId() == R.id.ImageButton08){
					strDialNo = sp.getString("dial_number" + String.valueOf(lineNo+7), "");
				}


				String actionFalg = sp.getString("action_value", FLAG_ACTION_CALL);

				if (!strDialNo.equals("")){

				    Intent intentCall = new Intent();

				    if (actionFalg.equals(FLAG_ACTION_CALL)){
				        intentCall.setAction(Intent.ACTION_CALL);
				    }else{
				        intentCall.setAction(Intent.ACTION_DIAL);
				    }

				    intentCall.setData(Uri.parse("tel:" + strDialNo));
				    startActivity(intentCall);

				    getActivity().finish();
				}else{
					 Toast.makeText(v.getContext(), getString(R.string.txt_no_reg), Toast.LENGTH_SHORT).show();
				}
			} catch (Exception e) {
				return;
			}
	    }
	}

}
