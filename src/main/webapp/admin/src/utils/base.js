const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmd3k1f/",
            name: "ssmd3k1f",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmd3k1f/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "游戏美术外包管理信息系统"
        } 
    }
}
export default base
