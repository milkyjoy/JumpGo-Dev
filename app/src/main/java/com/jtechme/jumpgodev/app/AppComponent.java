package com.jtechme.jumpgodev.app;

import javax.inject.Singleton;

import com.jtechme.jumpgodev.activity.BrowserActivity;
import com.jtechme.jumpgodev.constant.BookmarkPage;
import com.jtechme.jumpgodev.dialog.BookmarksDialogBuilder;
import com.jtechme.jumpgodev.fragment.BookmarkSettingsFragment;
import com.jtechme.jumpgodev.fragment.BookmarksFragment;
import com.jtechme.jumpgodev.object.SearchAdapter;
import dagger.Component;

/**
 * Created by Stefano Pacifici on 01/09/15.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(BrowserActivity activity);

    void inject(BookmarksFragment fragment);

    void inject(BookmarkSettingsFragment fragment);

    void inject(SearchAdapter adapter);

    void inject(BookmarksDialogBuilder builder);

    void inject(BookmarkPage bookmarkPage);
}
