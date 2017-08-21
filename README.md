# BindingAdapterUtills
A sweet ,small set of kotlin functions to reduce your android boilerplate code

## Dependency 

Add this in your project level `build.gradle` file (not your module `build.gradle` file):

```````
allprojects{
	repositories {
	maven { url "https://jitpack.io" }//add this line
	}
}
```````

Then, add the library to your module `build.gradle`

````
dependencies{
	compile 'com.github.priya5713:BindingAdapterUtills:-SNAPSHOT'
}
````

# Usage
## Using Glide imageview

`mBinding.url = imgurl //img url = "https://xyx.com",url is variable`


## Divider
use binding with recyclerview `binding.recyclerview`

## TextSwitcher
use binding with textswitcher ` binding.textLayoutSwitch = R.layout.root_layout `

