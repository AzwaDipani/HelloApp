package com.hello;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class fragmentmain extends AppCompatActivity {

    TabLayout tabLayout;
    private Toolbar toolbar;
    private NavigationView navigationView;
    ViewPager2 viewPager2;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentmain);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager2 = findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager2.setAdapter(viewPagerAdapter);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //navigationView = findViewById(R.id.navigationDrawer);
        //Menu menu = navigationView.getMenu();
        //setUpNavigationView(navigationView, menu);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                // Kode untuk event saat tab tidak dipilih
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                // Kode untuk event saat tab dipilih kembali
            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.getTabAt(position).select();
            }
        });
    }

    private void setUpNavigationView(final NavigationView navigationView, final Menu menu) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        Fragment selectedFragment = selectDrawerItem(menuItem);
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.toolbar, selectedFragment).commit();
                        navigationView.setCheckedItem(menuItem.getItemId());
                        setTitle(menuItem.getTitle());
                        return true;
                    }
                });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.nav_drawer_menu, menu);
        return true;
    }


    private Fragment selectDrawerItem(MenuItem menuItem) {
        // Implementasi untuk memilih Fragment berdasarkan item yang dipilih di NavigationView
        return new Fragment(); // Ganti dengan fragment yang sesuai
    }
}
