<template>
  <el-tree
      :data="menus"
      :props="defaultProps"
      node-key="catId"
      @node-click="nodeclick"
      :highlight-current = "true"
      ref="menuTree">
  </el-tree>
</template>

<script>
export default {
  name: "TreeComp",
  data(){
    return{
      menus: [],
      expandedKey: [],
      defaultProps: {
        children: "children",
        label: "name"
      }
    }
  },
  methods:{
    getMenus(){
      this.$http({
        url: this.$http.adornUrl("/product/category/list/tree"),
        method: "get"
      }).then(({ data }) => {
        this.menus = data.data;
      });
    },
    nodeclick(data, node, component){
      console.log("子组件category的节点被点击", data, node, component);
      //向父组件发送事件；
      this.$emit("tree-node-click", data, node, component);
    },
  },
  //生命周期 - 创建完成（可以访问当前this实例）
  created() {
    this.getMenus();
  },
}
</script>

<style scoped>

</style>
