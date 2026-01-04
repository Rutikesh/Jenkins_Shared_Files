def call (String url, String b_name){
      echo 'Cloning source code'
      checkout scm
      git url: "${url}", branch: "${b_name}"
      echo 'Code cloning successful'
}
