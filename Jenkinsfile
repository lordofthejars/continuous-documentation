stage 'Compile'

node {
    checkout scm
    sh './gradlew clean compileJava'
    stash excludes: 'build/', includes: '**', name: 'source'
}

stage 'Commit Tests'

node {
    echo 'Running Commit Tests'
}

stage 'Code Quality'

node {
    echo 'Running Static Code Analysis'
}

stage 'Documentation'

node {
    unstash 'source'
    sh './gradlew generateManual'
    publishHTML(target: [reportDir:'build/asciidoc/html5', reportFiles: 'manual.html', reportName: 'Manual'])
}