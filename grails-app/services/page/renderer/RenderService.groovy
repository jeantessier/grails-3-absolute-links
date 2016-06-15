package page.renderer


class RenderService {

    def groovyPageRenderer

    def createConfirmMessage() {
        groovyPageRenderer.render view: '/email/confirm', model: [ username: findUsername() ]
    }

    def createWelcomeMessage() {
        groovyPageRenderer.render template: '/email/welcome', model: [ username: findUsername() ]
    }

    def findUsername() {
        "mrhaki"
    }

}
