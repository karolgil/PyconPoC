@Library('Triggear') _

triggearRegister(
    eventType: "labeled",
    repository: "karolgil/PyconPoC",
    labels: ['check_perf'],
    requested_params: ["branch", "sha"]
)

// measure code

triggearComment(
    sha: params.sha,
    repository: 'karolgil/PyconPoC',
    body: 'Your code performance rate is 10/10 - Good job!'
)

triggearStatus(
    sha: params.sha,
    repository: 'karolgil/PyconPoC',
    state: 'success',
    description: "check full HTML report",
    url: "https://pl.pycon.org/2017/",
    context: "Performance"
)
