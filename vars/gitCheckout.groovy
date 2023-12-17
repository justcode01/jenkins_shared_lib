def call(Map stageParams) {

    Checkout([
        $class: 'GitSCM'
        branches: [(name: stageParams.branch )],
        userRemoteConfigs: [( url: stageParams.url )]
    ])
} 


