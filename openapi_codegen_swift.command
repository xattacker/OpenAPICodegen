
SOURCE="${BASH_SOURCE[0]}"
DIR="$( dirname "$SOURCE" )"
while [ -h "$SOURCE" ]
do 
  SOURCE="$(readlink "$SOURCE")"
  [[ $SOURCE != /* ]] && SOURCE="$DIR/$SOURCE"
  DIR="$( cd -P "$( dirname "$SOURCE"  )" && pwd )"
done
DIR="$( cd -P "$( dirname "$SOURCE" )" && pwd )"

cd "$DIR"

java -jar openapi-generator-cli.jar generate -i http://ptx.transportdata.tw/MOTC/API/Main/docs/v2 -g swift4 -o codeout_swift
read -p "Press enter to continue"
