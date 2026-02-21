def call(String url,string branch){
  echo "Clonning the branch"
  git url: "${url}", branch: "${branch}"
  echo "Code clonning successful"
}
