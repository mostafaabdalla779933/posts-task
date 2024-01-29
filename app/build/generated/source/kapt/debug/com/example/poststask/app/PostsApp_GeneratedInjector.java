package com.example.poststask.app;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = PostsApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface PostsApp_GeneratedInjector {
  void injectPostsApp(PostsApp postsApp);
}
