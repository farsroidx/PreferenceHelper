# Easy use of Android SharedPreference

[![](https://jitpack.io/v/farsroidx/PreferenceHelper.svg)](https://jitpack.io/#farsroidx/PreferenceHelper)

# Step 1. Add the JitPack repository to your build file 

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  # Step 2. Add the dependency
  
  	dependencies {
	        implementation 'com.github.farsroidx:PreferenceHelper:1.0.2'
	}
	

/////////////////////////////////////


# Sample SharedPreferenceUtils Class:

        SPUtils utils = SPUtils.getInstance(this);

        // Write To Preference
        utils.writeString  ("key" , "text");
        utils.writeBoolean ("key" , true);
        utils.writeFloat   ("key" , 1.85F);
        utils.writeInteger ("key" , 85);
        utils.writeLong    ("key" , 85L);

        // Read From Preference
        String  s  = utils.readString  ("key" , "alternative" );
        boolean b  = utils.readBoolean ("key" , false);
        float   f  = utils.readFloat   ("key" , 1.02F);
        int     i  = utils.readInteger ("key" , 0);
        long    l  = utils.readLong    ("key" , 85L);

        utils.remove("key");
        utils.clearAll();
	
