package com.example.android.groupchat;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Nichay Jain on 03-05-2019.
 */

public class TabsAccessorAdapter extends FragmentPagerAdapter {
    public TabsAccessorAdapter(android.support.v4.app.FragmentManager fm)
    {
        super(fm);
    }
    @Override
    public android.support.v4.app.Fragment getItem(int i) {
        switch (i)
        {
            /*case 0:
                ChatsFragment chatsFragment = new ChatsFragment();
                return chatsFragment;*/

            case 0:
                com.example.android.groupchat.GroupsFragment groupsFragment = new com.example.android.groupchat.GroupsFragment();
                return groupsFragment;

            /*case 2:
                ContactsFragment contactsFragment = new ContactsFragment();
                return contactsFragment;*/



            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            //case 0:return "Chats";


            case 0:

                return "Groups";

            //case 2:return "Contacts";



            default:
                return null;
        }
    }
}
