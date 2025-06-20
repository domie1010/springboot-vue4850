const base = {
    get() {
        return {
            url : "http://localhost:8080/zonghesuzhipingjiaxitong/",
            name: "zonghesuzhipingjiaxitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zonghesuzhipingjiaxitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "数计学院学生综合素质评价系统"
        } 
    }
}
export default base
